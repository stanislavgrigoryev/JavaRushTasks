package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Charset koi8 = Charset.forName("Windows-1251");
        Charset windows1251 = StandardCharsets.UTF_8;
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        while (inputStream.available()>0){
            byte[] buffer = new byte[1000];
            inputStream.read(buffer);
            String s = new String(buffer, koi8);
            buffer = s.getBytes(windows1251);
            outputStream.write(buffer);
        }
    }
}
