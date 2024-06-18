package org.example.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ManyManyDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Employee e1 = new Employee();
        e1.setEmpID(101);
        e1.setEmpName("Aman Singh");

        Employee e2 = new Employee();
        e1.setEmpID(102);
        e1.setEmpName("Saksham");



        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);


        Project p1 = new Project();
        p1.setProjectId(501);
        p1.setProjectName("Library Management");
        p1.setEmployee(employeeList);

        Project p2 = new Project();
        p1.setProjectId(502);
        p1.setProjectName("Hotel management");




        Session session = factory.openSession();

        session.beginTransaction();

        session.save(p1);
        session.save(p2);
        session.save(e1);
        session.save(e2);


        session.getTransaction().commit();

        session.close();
        factory.close();



    }
}
