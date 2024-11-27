package com.baeldung;

import com.baeldung.entities.Image;
import com.baeldung.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class MappingSets {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();

        Configuration configure = configuration.configure("hibernate.cfg.xml");

        configure.addAnnotatedClass(Student.class);
        configure.addAnnotatedClass(Image.class);

        SessionFactory sessionFactory = configure.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        Set<String
                > images = new HashSet<>();
        images.add("file1");
        images.add("file2");

        session.getTransaction().begin();

//        Student student = new Student("lukas", "p", "lukasp14@op.pl");
//        session.persist(student);

        Student student = session.find(Student.class, 1);
        student.setImages(images);

        session.merge(student);

        session.getTransaction().commit();

    }
}