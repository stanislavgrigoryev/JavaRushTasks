package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())) {
            HashMap<Integer, Integer> map = new HashMap<>();
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    map.put(read, map.get(read)+1);
                }
            }
            Integer max = Collections.min(map.values());
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(max)){
                    Integer key = entry.getKey();
                    System.out.print(key + " ");
                }
            }
        }
    }
}
