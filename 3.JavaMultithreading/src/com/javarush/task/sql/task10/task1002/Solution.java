package com.javarush.task.sql.task10.task1002;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        Employee query;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "from Employee e WHERE e.smth = 'director'";
            query = session.createQuery(hql, Employee.class).uniqueResult();
        }
        return query;
    }
}