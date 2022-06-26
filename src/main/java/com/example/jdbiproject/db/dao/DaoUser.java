package com.example.jdbiproject.db.dao;

import com.example.jdbiproject.db.model.EntityUser;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoUser extends BaseDao<EntityUser> {

    @Autowired
    public DaoUser(Jdbi jdbi) {
        super(EntityUser.class, jdbi);

        this.insert(new EntityUser("jozef", "[]", 11));
    }

}
