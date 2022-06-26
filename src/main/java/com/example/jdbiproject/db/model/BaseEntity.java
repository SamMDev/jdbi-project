package com.example.jdbiproject.db.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class BaseEntity {
    @Id
    @Column(name = "id")
    private Long id;
}
