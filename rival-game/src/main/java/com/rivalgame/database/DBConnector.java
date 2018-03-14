package com.rivalgame.database;

import com.rivalgame.characters.Characters;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class DBConnector implements DataB {


    EntityManagerFactory sessionFactory;
    EntityManager entityManager;

    @Override
    public Characters setUp() throws Exception {
        sessionFactory= Persistence.createEntityManagerFactory("transcom-db");

        return null;
    }

    @Override
    public Characters save(Characters characters) {
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(characters);
        entityManager.getTransaction().commit();
        entityManager.close();


        return characters;
    }

    @Override
    public void read() {
        sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        // some magic here //
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
