package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
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

    public static void main1(String[] args) throws IOException {
         Files.readAllLines(Path.of(args[0])).stream()
                .collect(Collectors.toMap(string -> string.split(" ")[0], string -> Double.parseDouble(string.split(" ")[1]), Double::sum, TreeMap::new))
                .forEach((key, value) -> System.out.println(key + " " + value));

    }
}
