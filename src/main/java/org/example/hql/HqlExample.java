package org.example.hql;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class HqlExample {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        //select
//        String query = "from Student where city=:x";

//        Query query1 = session.createQuery(query);
//        query1.setParameter("x","Noida");
//
//        List<Student> list = query1.list();
//
//        list.forEach(student -> System.out.println(student.getName()));



        session.beginTransaction();

        //delete

//        String query = "delete from Student where city =: c";
//
//        Query query1 = session.createQuery(query);
//        query1.setParameter("c","Noida");
//
//        int rowAffected = query1.executeUpdate();
//
//        System.out.println("Number of record deleted:"+rowAffected);

        //update

//        String query = "update Student set city = :c where name=:n";
//
//        Query query1 = session.createQuery(query);
//
//        query1.setParameter("c","Noida");
//        query1.setParameter("n","Ashish Singh");
//
//        int rowAffected = query1.executeUpdate();
//
//        System.out.println("Number of record updated:"+rowAffected);

        String query = "select q.questionId, q.question, a.answer from Question as q INNER JOIN q.answer as a";

        Query query1 = session.createQuery(query);

        List<Object[]> list = query1.getResultList();

        for(Object[] arr : list){
            System.out.println(Arrays.toString(arr));
        }

        session.getTransaction().commit();

        session.close();
        factory.close();

    }
}
