package com.javarush.task.task19.task1925;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.split(" ");
                for (String word : split) {
                    if (word.length() > 6){
                        builder.append(word).append(",");
                    }
                }
            }
//            bufferedWriter.write(builder.substring(0,builder.length()-1));
            bufferedWriter.write(builder.toString().replaceAll(",$", ""));
        }

    }

    public static void main1(String[] args) throws IOException {
      Files.writeString(Path.of(args[1]), Arrays.stream(Files.readString(Path.of(args[0])).split("[\\r\\n\\s]+"))
                .filter(s -> s.length() > 6)
                .collect(Collectors.joining(",")));
    }
}
