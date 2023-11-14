package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        byte min = Byte.MAX_VALUE;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (i < min) {
                min = (byte) i;

            }
        }
        System.out.println(min);
        fileInputStream.close();
    }
}
