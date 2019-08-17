package com.numbers.onlinestore.infrastructure.data.generics;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.hibernate.Session;

public abstract class Repository<TEntity extends BaseEntity> {
    
    protected Session session = null;

    private Class<TEntity> entityClass;

    public Repository() {}

    public Optional<TEntity> get(Integer id) {
        return session.byId(entityClass).loadOptional(id);
    }

    public List<TEntity> getAll() {
        return session.createQuery("from " + entityClass.getSimpleName(), entityClass).list();
    }

    public void insert(TEntity entity) {
        session.save(entity);
    }

    public void delete(TEntity entity) {
        session.delete(entity);
    }

    public void delete(int id) throws NoSuchElementException {
        var entityToDelete = get(id).orElseThrow();
        session.delete(entityToDelete);
    }

    public void update(TEntity entity) {
        session.update(entity);
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

}