package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileOne = scanner.nextLine();
        String fileTwo = scanner.nextLine();
        String fileThree = scanner.nextLine();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOne, true));
             BufferedReader readerFileTwo = new BufferedReader(new FileReader(fileTwo));
             BufferedReader readerFileThree = new BufferedReader(new FileReader(fileThree))) {
            String readTwo = readerFileTwo.readLine();
            String readThree = readerFileThree.readLine();
            bufferedWriter.write(readTwo);
            bufferedWriter.write(readThree);
        }
    }
}
