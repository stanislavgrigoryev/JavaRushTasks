package com.javarush.task.task18.task1827;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        int max = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String str = string.substring(0, 8).trim();
                int id = Integer.parseInt(str);
                if (id > max) {
                    max = id;
                }
            }
            if (args.length != 0) {
                if (args[0].equals("-c")) {
                    String id = checkLines(String.valueOf(max + 1), 8);
                    String productName = checkLines(args[1], 30);
                    String price = checkLines(args[2], 8);
                    String quantity = checkLines(args[3], 4);
                    writer.newLine();
                    writer.write(id + productName + price + quantity);
                }
            }
        }
    }

    public static String checkLines(String string, int limit) {
        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
//            return string + " ".repeat(limit - string.length());
            StringBuilder builder = new StringBuilder(string);
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();

        }

    }
}
