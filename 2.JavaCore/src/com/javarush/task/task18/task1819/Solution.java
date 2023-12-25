package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName1));
            BufferedReader reader1 = new BufferedReader(new FileReader(fileName2))){
            String readFileName1 = reader.readLine();
            String readFileName2 = reader1.readLine();
            String stringBuilder = readFileName2 +
                    readFileName1;
            writer.write(stringBuilder);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
