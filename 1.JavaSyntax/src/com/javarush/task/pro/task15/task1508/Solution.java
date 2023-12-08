package com.javarush.task.pro.task15.task1508;

import java.io.*;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        InputStream stream = System.in;
        InputStreamReader reader = new InputStreamReader(stream);
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
                String s = bufferedReader.readLine();
                char[] charArray = s.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    if (i % 2 == 1) {
                        System.out.print(String.valueOf(charArray[i]).toUpperCase());
                    } else {
                        System.out.print(String.valueOf(charArray[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

