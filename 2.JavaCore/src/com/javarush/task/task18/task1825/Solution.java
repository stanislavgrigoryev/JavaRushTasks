package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> map = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = reader.readLine();
                if (fileName.equals("end")) {
                    break;
                }
                String number = fileName.substring(fileName.lastIndexOf("t") + 1);
                int index = Integer.parseInt(number);
                if (!map.containsKey(index)){
                    map.put(index, fileName);
                }
            }
        }
        for (String fileName : map.values()) {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(shortName, true))){
                while (inputStream.available() > 0){
                    outputStream.write(inputStream.read());
                }
            }
        }
    }
}
