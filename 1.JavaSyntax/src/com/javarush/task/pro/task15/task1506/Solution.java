package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
            list.forEach(s -> {
                char[] chars = s.toCharArray();
                for (char aChar : chars) {
                    if (aChar != ' ' && aChar != '.' && aChar != ',') {
                        System.out.print(aChar);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

