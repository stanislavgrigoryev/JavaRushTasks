package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = readerConsole.readLine();
        String outputFile = readerConsole.readLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String newText = line.replaceAll("[\\p{P}\n]", "");
                bufferedWriter.write(newText);
            }
        }
        readerConsole.close();
    }
}
