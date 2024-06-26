package com.javarush.task.sql.task10.task1007;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/* 
task1007
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()){
            String hql = "FROM Employee e WHERE e.smth in (:in) ORDER BY e.age";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.setParameterList("in", in);
            return query.list();

        }

    }
}