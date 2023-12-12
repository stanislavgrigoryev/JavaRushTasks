package com.javarush.task.pro.task15.task1522;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream inputStream = url.openStream();
        byte[] bytes = inputStream.readAllBytes();
        String s = new String(bytes);
        System.out.println(s);
    }
}