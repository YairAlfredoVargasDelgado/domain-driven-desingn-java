package com.numbers.onlinestore.infrastructure.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.lang.reflect.ParameterizedType;

import com.numbers.onlinestore.infrastructure.data.generics.BaseEntity;
import com.numbers.onlinestore.infrastructure.data.generics.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UnitOfWork implements Serializable {
    
    private static final long serialVersionUID = -6576430394157898043L;

    private static UnitOfWork unitOfWork = null;

    private static SessionFactory sessionFactory;

    private static Session session;

    private static List<Repository<BaseEntity>> repositories = new ArrayList<>();

    private UnitOfWork() {
        setUp();
    }

    private void setUp() {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

    public static <TEntity extends BaseEntity> void addRepository(Repository<TEntity> repository) {
        repositories.add((Repository<BaseEntity>)repository);
    }
    
    public static void getRepository(BaseEntity entity) throws NoSuchElementException {
        Repository<BaseEntity> selectedRepository = repositories.stream().filter(repository -> {
            return ((ParameterizedType)repository.getClass().getGenericSuperclass()).getActualTypeArguments()[0].equals(entity.getClass());
        }).findFirst().orElseThrow();
        selectedRepository.setSession(session);
    }

    public static void beginTransaction() {
        session = sessionFactory.openSession();
    }

    public static void commit() {
        session.getTransaction().commit();
    }

    public synchronized static UnitOfWork getInstance() {
        if (unitOfWork == null) {
            unitOfWork = new UnitOfWork();
        }
        return unitOfWork;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}