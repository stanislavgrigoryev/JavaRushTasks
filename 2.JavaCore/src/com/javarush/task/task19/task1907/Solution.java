package com.javarush.task.task19.task1907;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.stream(Files.readString(Path.of(reader.readLine()))
                        .replaceAll("\\p{Punct}", " ").split(" "))
                .filter(word -> word.equals("world")).count());

    }

    public static void main1(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.replaceAll("\\p{Punct}", " ").split(" ");
                for (String word : split) {
                    if (word.equals("world")) {
                        count++;
                    }
                }

            }
            System.out.println(count);
        }
    }
}
