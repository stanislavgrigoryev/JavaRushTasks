package com.javarush.task.sql.task10.task1006;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1006
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getBetween(25, 32).forEach(System.out::println);
    }

    public static List<Employee> getBetween(int from, int to) {
        Query<Employee> query;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "FROM Employee e WHERE e.age > :FROM AND age < :TO ORDER BY e.age";
            query = session.createQuery(hql, Employee.class);
            query.setParameter("FROM", from);
            query.setParameter("TO", to);
        }
        return query.list();
    }
}