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
    public void setUp() throws Exception {
       EntityManagerFactory sessionFactory= Persistence.createEntityManagerFactory("transcom-db");

    }

    @Override
    public void save(Characters characters) {
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(characters);
        entityManager.getTransaction().commit();
        entityManager.close();



    }

    @Override
    public void read() {
        sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        //List<Characters> charactersList = entityManager.createQuery("from Characters ", Characters.class);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
