package com.example.jdbiproject.service;

import com.example.jdbiproject.db.dao.BaseDao;
import com.example.jdbiproject.db.model.BaseEntity;

import java.util.List;

/**
 * Abstract service implementing all BaseDao functionalities,
 * so there is no need to duplicate code inside services
 *
 * @param <E> for what entity is the service for
 * @param <D> dao for service
 * @author Samuel Molčan
 */
public abstract class AbstractEntityService<E extends BaseEntity, D extends BaseDao<E>> {

    protected final D dao;

    protected AbstractEntityService(D dao) {
        this.dao = dao;
    }

    public void insert(E entity) {
        this.dao.insert(entity);
    }

    public void update(E entity) {
        this.dao.update(entity);
    }

    public E findById(Long id) {
        return this.dao.findById(id);
    }

    public void deleteById(Long id) {
        this.dao.deleteById(id);
    }

    public List<E> findAll() {
        return this.dao.findAll();
    }


}
