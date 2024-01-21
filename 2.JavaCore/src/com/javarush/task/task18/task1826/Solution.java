package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if (args[0].equalsIgnoreCase("-e")) {
                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    fileOutputStream.write(read + 1);
                }
            } else if (args[0].equalsIgnoreCase("-d")) {
                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    fileOutputStream.write(read - 1);
                }
            }
        }
    }
}
