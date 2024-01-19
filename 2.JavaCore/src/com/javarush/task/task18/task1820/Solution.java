package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))){
            while (reader.ready()){
                String line = reader.readLine();
                String[] split = line.split(" ");
                for (String number : split) {
                    int round = (int)Math.round(Double.parseDouble(number));
                    writer.write(String.valueOf(round));
                    writer.write(" ");
                }
            }
        }
        console.close();
    }
}
