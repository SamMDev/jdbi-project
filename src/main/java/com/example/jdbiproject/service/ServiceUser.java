package com.example.jdbiproject.service;

import com.example.jdbiproject.db.dao.DaoUser;
import com.example.jdbiproject.db.model.EntityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser extends AbstractEntityService<EntityUser, DaoUser> {

    private final DaoUser daoUser;

    private final ServiceBinaryObject serviceBinaryObject;

    @Autowired
    public ServiceUser(DaoUser dao, ServiceBinaryObject serviceBinaryObject) {
        super(dao);
        this.daoUser = dao;
        this.serviceBinaryObject = serviceBinaryObject;
    }

}
