package com.example.jdbiproject.service;

import com.example.jdbiproject.db.dao.DaoBinaryObject;
import com.example.jdbiproject.db.model.EntityBinaryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBinaryObject extends AbstractEntityService<EntityBinaryObject, DaoBinaryObject> {

    @Autowired
    public ServiceBinaryObject(DaoBinaryObject dao) {
        super(dao);
    }
}
