package com.wipro.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateApp {
    public static void main(String[] args) {
        // Load configuration and build SessionFactory
        Configuration cfg = new Configuration();
        cfg.configure("hibernate-cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Create session
        Session session = factory.openSession();

        // Begin transaction
        Transaction tx = session.beginTransaction();

        // Create PAN objects and save them
        PAN pan1 = new PAN("Amit Kumar", "ABCDE1234F");
        PAN pan2 = new PAN("Sonal Sharma", "WXYZ5678Q");

        session.save(pan1);
        session.save(pan2);

        // Commit transaction
        tx.commit();
        System.out.println("Records inserted successfully!");

        // Close session and factory
        session.close();
        factory.close();
    }
}