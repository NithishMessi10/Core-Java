package com.xworkz.entitiesTask.traffic;

import com.xworkz.entitiesTask.flims.FilmEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("emf is created"+emf);
        EntityManager em=emf.createEntityManager();
        System.out.println("em is created "+em);

        EntityTransaction et=em.getTransaction();
        System.out.println("transaction get started"+et);
        et.begin();
        System.out.println("begin transaction");
        em.persist(new TrafficEntity(2,"magadi road","magadi 12th cross",5));
        et.commit();
        System.out.println("committed transaction");
        em.close();
        System.out.println("em is closed");
        emf.close();
        System.out.println("emf is closed");


    }
}
