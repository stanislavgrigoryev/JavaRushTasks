package com.javarush.task.sql.task13.task1303;

import com.javarush.task.sql.task13.task1303.entities.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task13.task1303.entities.Publisher;

import java.util.List;

/* 
Опять книги
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Publisher> publishers;

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select distinct b.publisher from Book b WHERE b.author.fullName = :username";
            Query<Publisher> query = session.createQuery(hql, Publisher.class);
            query.setParameter("username", "Mark Twain");
            publishers = query.list();
        }

        publishers.stream().map(Publisher::getName).forEach(System.out::println);
    }
}
