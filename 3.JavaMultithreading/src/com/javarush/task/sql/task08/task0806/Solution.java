package com.javarush.task.sql.task08.task0806;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        String sql = "SELECT * FROM employee";
        Statement preparedStatement = connection.createStatement();
        ResultSet resultSet = preparedStatement.executeQuery(sql);
        while (resultSet.next()) {
            Employee employee = new Employee();
            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setAge(resultSet.getInt(3));
            employee.setSmth(resultSet.getString(4));
            employees.add(employee);
        }
        employees.forEach(System.out::println);
        connection.close();
        preparedStatement.close();
    }
}
