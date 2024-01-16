package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String file = bufferedReader.readLine();
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String text = reader.readLine();
                String[] arrayText = text.split(" ");
                for (int i = 0; i < arrayText.length; i += 2) {
                    String key = arrayText[i];
                    Double value = Double.parseDouble(arrayText[i + 1]);
                    map.merge(key, value, Double::sum);
                }
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.println(key + " " + value);
            }

        }
    }
}
