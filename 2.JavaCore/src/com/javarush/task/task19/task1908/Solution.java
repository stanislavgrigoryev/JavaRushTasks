package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))){
            while (bufferedReader.ready()){
                String text = bufferedReader.readLine();
               String[] strings = text.split(" ");
                for (String string : strings) {
                   if (string.matches("\\b\\d+\\b")){
                        bufferedWriter.write(string + " ");
                   }
               }
            }
reader.close();
        }

    }
}
