package com.javarush.task.task18.task1824;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = reader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
        reader.close();
    }
}
