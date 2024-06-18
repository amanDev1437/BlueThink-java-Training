package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Project Started");

        Student student = new Student(105,"Ashish Singh",new Address("Sector 73","Prayagraj"));

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

       Session session = factory.openSession();
       session.beginTransaction();
       session.save(student);
       session.getTransaction().commit();

       session.close();
       factory.close();
    }
}