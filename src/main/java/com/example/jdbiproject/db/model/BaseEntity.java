package com.example.jdbiproject.db.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
public class BaseEntity {
    @Id
    @Column(name = "id")
    private Long id;

    public boolean hasId() {
        return this.id != null;
    }
}
