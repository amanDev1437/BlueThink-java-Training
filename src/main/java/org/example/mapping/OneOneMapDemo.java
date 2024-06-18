package org.example.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneOneMapDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Question q1 = new Question();

        q1.setQuestionId(102);
        q1.setQuestion("What is java ?");

        Answer a1 = new Answer();
        a1.setAnswerId(202);
        a1.setAnswer("Java is Programming language");

        a1.setQuestion(q1);
        q1.setAnswer(a1);

        Session session = factory.openSession();

        session.beginTransaction();


        session.save(q1);
        session.save(a1);

        session.getTransaction().commit();

        Question newQue = session.get(Question.class,102);

        System.out.println(newQue.getQuestion());
        System.out.println(newQue.getAnswer().getAnswer());

        session.close();
        factory.close();



    }
}
