package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee limit 1");
        ResultSetMetaData metaData = resultSet.getMetaData();

        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            String name = metaData.getColumnName(i);
            String typeName = metaData.getColumnTypeName(i);
            System.out.println(name + "(" + typeName + ")");
        }
        connection.close();
        statement.close();
    }
}
