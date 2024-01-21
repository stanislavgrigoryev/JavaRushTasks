package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Arrays;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();
        String file3 = console.readLine();
        try (FileInputStream inputStream = new FileInputStream(file1);
             FileOutputStream outputStream2 = new FileOutputStream(file2);
             FileOutputStream outputStream3 = new FileOutputStream(file3)) {
            int half = (inputStream.available() + 1) / 2;
            int count = 0;
            while (inputStream.available() > 0) {
                if (count < half) {
                    outputStream2.write(inputStream.read());
                    count++;
                } else {
                    outputStream3.write(inputStream.read());
                }
            }
        }
    }
}
