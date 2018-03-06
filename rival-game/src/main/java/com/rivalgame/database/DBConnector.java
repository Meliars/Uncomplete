package com.rivalgame.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;

public class DBConnector {

    SessionFactory sessionFactory;

    public void saving(Object object){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
    }

    /* public void reading(){
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         List result = session.createQuery("from CharacterInfo").list();
         for ( CharacterInfo characterInfo : (List<CharacterInfo>) result ) {
             System.out.println( "CharacterInfo (" + characterInfo.getLogin() + ") : " + characterInfo.getLogin() );
         }
         session.getTransaction().commit();
         session.close();
     }

 */
    protected void setUp() throws Exception {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure()
                .build();

        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();


        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}

