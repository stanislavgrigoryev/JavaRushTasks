package com.javarush.task.sql.task09.task0903;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/* 
task0903
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER,"com.mysql.jdbc.Driver");
        properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.setProperty(Environment.USER, "root");
        properties.setProperty(Environment.PASS, "root");

        SessionFactory sessionFactory =
                new Configuration().setProperties(properties).addAnnotatedClass(Animal.class).buildSessionFactory();

    }
}