package com.example.jdbiproject.service;

import com.example.jdbiproject.db.dao.DaoUser;
import com.example.jdbiproject.db.model.EntityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractEntityService<EntityUser, DaoUser> {

    private final DaoUser daoUser;

    @Autowired
    public UserService(DaoUser dao) {
        super(dao);
        this.daoUser = dao;
    }

}
