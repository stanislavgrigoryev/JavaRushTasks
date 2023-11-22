package com.javarush.task.task18.task1816;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.readString(Path.of(args[0])).chars().filter(value -> value >= 65 && value <= 122 && Character.isAlphabetic(value)).count());

    }
    public static void main1(String[] args) throws IOException {
        int count = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()){
                int read = fileReader.read();
                if (read >= 65 && read <= 122 && Character.isAlphabetic(read)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
