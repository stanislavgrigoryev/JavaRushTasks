package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.split(" ");
                String key = split[0];
                Double value = Double.parseDouble(split[1]);
                map.merge(key, value, Double::sum);

            }
        }
        Double max = Collections.max(map.values());
        ArrayList<String> name = new ArrayList<>();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                name.add(entry.getKey());
            }
        }
        for (String s : name) {
            System.out.println(s);
        }
    }

    public static void main1(String[] args) throws IOException {
        TreeMap<String, Double> map = Files.readAllLines(Path.of(args[0])).stream().map(s -> s.split(" ")).
                collect(Collectors.toMap(strings -> String.valueOf(strings[0]), strings -> Double.parseDouble(strings[1]), Double::sum, TreeMap::new));
        map.entrySet().stream().filter(entry -> entry.getValue().equals(Collections.max(map.values())))
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}


