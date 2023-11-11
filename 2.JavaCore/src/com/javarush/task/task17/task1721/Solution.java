package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException, CorruptedDataException {
        new Solution().joinData();

        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        File file = new File(file1);
        File file3 = new File(file2);
        Scanner scanner1 = new Scanner(file);
        Scanner scanner2 = new Scanner(file3);
        while (scanner1.hasNextLine()) {
            allLines.add(scanner1.nextLine());
            while (scanner2.hasNextLine()) {
                forRemoveLines.add(scanner2.nextLine());
            }
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

