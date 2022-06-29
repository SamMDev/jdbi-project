package com.example.jdbiproject.db.dao;

import com.example.jdbiproject.db.model.EntityBinaryObject;
import com.example.jdbiproject.db.model.EntityProduct;
import com.example.jdbiproject.jdbi.JoinEntityRowReducer;
import com.example.jdbiproject.jdbi.JoinedEntity;
import org.apache.commons.lang3.tuple.Pair;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoProduct extends BaseDao<EntityProduct> {

    @Autowired
    public DaoProduct(Jdbi jdbi) {
        super(EntityProduct.class, jdbi);
    }

    public List<JoinedEntity> getProductsWithImages() {
        return this.jdbi.withHandle(handle ->
                handle.createQuery(
                                """
                                                SELECT * FROM printify.product
                                                LEFT OUTER JOIN printify.binary_obj ON product.binary_obj_id = binary_obj.id
                                        """)
                        .reduceRows(new JoinEntityRowReducer<>(EntityProduct.class, Pair.of(EntityBinaryObject.class, JoinedEntity.JoinType.ONE_TO_ONE)))
                        .toList());
    }
}
