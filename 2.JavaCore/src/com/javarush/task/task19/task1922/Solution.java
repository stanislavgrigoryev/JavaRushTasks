package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {

    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                int count = 0;
                String line = bufferedReader.readLine();
                String[] split = line.split(" ");
                for (String word : split) {
                    if (words.contains(word)){
                        count++;
                    }
                } if (count == 2){
                    System.out.println(line);
                }
            }
        }
        reader.close();
    }
}
