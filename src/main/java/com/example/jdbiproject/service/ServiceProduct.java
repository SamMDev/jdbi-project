package com.example.jdbiproject.service;

import com.example.jdbiproject.db.dao.DaoProduct;
import com.example.jdbiproject.db.model.EntityProduct;
import com.example.jdbiproject.jdbi.JoinedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct extends AbstractEntityService<EntityProduct, DaoProduct> {

    @Autowired
    public ServiceProduct(DaoProduct dao) {
        super(dao);
        List<JoinedEntity> j = this.findWithImages();
        System.out.println(j);
    }

    public List<JoinedEntity> findWithImages() {
        return this.dao.getProductsWithImages();
    }
}
