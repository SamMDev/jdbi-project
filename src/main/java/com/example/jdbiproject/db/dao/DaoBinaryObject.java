package com.example.jdbiproject.db.dao;

import com.example.jdbiproject.db.model.EntityBinaryObject;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoBinaryObject extends BaseDao<EntityBinaryObject> {

    @Autowired
    public DaoBinaryObject(Jdbi jdbi) {
        super(EntityBinaryObject.class, jdbi);
    }
}
