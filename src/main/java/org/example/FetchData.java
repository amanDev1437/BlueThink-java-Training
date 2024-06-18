package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        Student student = session.get(Student.class,103);

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAddress().getAddressId());
        System.out.println(student.getAddress().getStreet());
        System.out.println(student.getAddress().getCity());

        session.close();
        factory.close();

    }
}
