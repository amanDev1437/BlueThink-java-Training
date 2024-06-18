package org.example.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneManyDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        NewStudent s1 = new NewStudent();
        s1.setStudentId(1);
        s1.setRollNo(2214);
        s1.setName("Aman Singh");

        Course c1 = new Course(211,"core java","6 months",s1);
        Course c2 = new Course(212,"JDBC","2 months",s1);
        Course c3 = new Course(213,"Hibernate","2 month",s1);

        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);


        s1.setCourses(courseList);

        Session session = factory.openSession();

        session.beginTransaction();

        session.save(s1);

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
