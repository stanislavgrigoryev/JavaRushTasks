package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        PrintWriter writer = new PrintWriter(outputStream);
        for (Map.Entry<String, String> entry : runtimeStorage.entrySet()) {
            properties.setProperty(entry.getKey(), entry.getValue());
        }
        properties.store(writer, "comm");
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties in = new Properties();
        in.load(inputStream);
        for (Map.Entry<Object, Object> entry : in.entrySet()) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            runtimeStorage.put(key, value);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
