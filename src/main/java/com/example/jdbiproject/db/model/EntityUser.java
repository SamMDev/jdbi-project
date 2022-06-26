package com.example.jdbiproject.db.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class EntityUser extends BaseEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "roles", length = 4000)
    public String roles;

    @Column(name = "age")
    public Integer age;
}
