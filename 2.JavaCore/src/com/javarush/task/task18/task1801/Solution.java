package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/
//C:\Users\setka\Desktop\read.docx

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        byte max = 0;
        while (fileInputStream.available() > 0){
            int i = fileInputStream.read();
            if (i > max){
                max = (byte) i;

            }
        }
        System.out.println(max);
        fileInputStream.close();
    }
}
