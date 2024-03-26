package com.javarush.task.sql.task07.task0709;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            Float weight = resultSet.getObject("weight", Float.class);
            LocalDate birthday = resultSet.getObject("birthday", LocalDate.class);
            Long inn = resultSet.getObject("inn", Long.class);

            System.out.println(name + " " + weight + " " + birthday + " " + inn);
        }
        connection.close();
        statement.close();
    }
}
