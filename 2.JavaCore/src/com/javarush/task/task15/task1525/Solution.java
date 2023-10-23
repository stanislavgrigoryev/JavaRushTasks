package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        File file = new File(Statics.FILE_NAME);
//        String string1 = null;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] strings = line.split(",");
                for (String string : strings) {
                    lines.add(string);
                }
            }
        } catch (FileNotFoundException e) {
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
