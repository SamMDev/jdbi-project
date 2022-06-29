package com.example.jdbiproject.controller.user;

import com.example.jdbiproject.db.model.EntityUser;
import com.example.jdbiproject.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final ServiceUser serviceUser;

    @Autowired
    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping("/all")
    public List<EntityUser> all() {
        return this.serviceUser.findAll();
    }
}
