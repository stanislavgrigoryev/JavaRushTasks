package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            TreeMap<String,Double> map = new TreeMap<>();
            while (reader.ready()){
                String text = reader.readLine();
                String[] split = text.split(" ");
                String name = split[0];
                Double value = Double.parseDouble(split[1]);

                if (!map.containsKey(name)) {
                    map.put(name,value);
                } else {
                    map.put(name,map.get(name) + value);
                }
            }
            Double max = map.values().stream().max(Comparator.naturalOrder()).get();
            map.entrySet().stream().filter(entry -> entry.getValue().equals(max))
                    .forEach(entry -> System.out.println(entry.getKey()));
        }

    }
}
