package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        while (fileInputStream.available() > 0) {
            byte[] buffer = new byte[fileInputStream.available()];
            int read = fileInputStream.read(buffer);
            for (int i = buffer.length -1; i >= 0 ; i--) {
                fileOutputStream.write(buffer[i]);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
