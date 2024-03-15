package com.javarush.task.sql.task07.task0704;

import java.sql.*;

/* 
task0704
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) {
            String string = resultSet.getString("name");
            System.out.println(string);
        }
        connection.close();
        statement.close();
    }
}
