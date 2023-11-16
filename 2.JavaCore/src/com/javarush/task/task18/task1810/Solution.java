package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(s);
            if (fileInputStream.available() < 1000) {
                throw new DownloadException();
            }
            fileInputStream.close();
        }

    }

    public static class DownloadException extends Exception {

    }
}
