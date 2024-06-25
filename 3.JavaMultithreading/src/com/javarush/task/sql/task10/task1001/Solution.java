package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            String hql = "SELECT distinct e.smth FROM Employee e WHERE e.age > 18 ORDER BY e.smth";
            Query<String> query = session.createQuery(hql, String.class);
            for (String s : query.list()) {
                System.out.println(s);
            }
        }
    }
}