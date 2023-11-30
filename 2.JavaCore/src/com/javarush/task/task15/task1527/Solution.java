package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String query = new URL(reader.readLine()).getQuery();

        String[] strings = query.split("&");
        for (String string : strings) {
            if (string.contains("=")){
                System.out.print(string.substring(0, string.indexOf("=")) + " ");
            } else {
                System.out.print(string + " ");
            }

        }
        System.out.println();
        for (String string : strings) {
            if (string.contains("obj")){
                String str = string.substring(string.indexOf("=") + 1);
                if (str.matches("[\\d.]+")){
                    alert(Double.parseDouble(str));
                } else {
                    alert(str);
                }
//                try {
//                    alert(Double.parseDouble(str));
//                } catch (NumberFormatException e) {
//                   alert(str);
//                }
            }
        }

    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
