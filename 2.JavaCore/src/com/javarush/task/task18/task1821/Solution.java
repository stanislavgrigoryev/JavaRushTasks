package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        String file = console.readLine();
        Map<Character, Integer> map = new TreeMap<>();
        try (FileInputStream reader = new FileInputStream(args[0])) {
            while (reader.available() > 0) {
                char i = (char) reader.read();
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
//        console.close();
    }
}
