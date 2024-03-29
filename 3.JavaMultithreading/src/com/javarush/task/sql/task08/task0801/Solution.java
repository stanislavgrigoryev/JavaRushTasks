package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name LIKE 'Diego'");
        statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name LIKE 'Amigo'");
        connection.commit();
        connection.close();
        statement.close();
    }
}
