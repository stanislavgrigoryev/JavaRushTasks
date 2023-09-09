package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
      grades.put("fdbab",2.5);
      grades.put("shyha", 2.5);
      grades.put("eythq", 5.5);
      grades.put("kMKRMBK", 2.4);
      grades.put("olKR", 4.1);
    }
}
