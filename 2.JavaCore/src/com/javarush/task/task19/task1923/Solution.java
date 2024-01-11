package com.javarush.task.task19.task1923;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String regex = "\\b(\\p{L}*\\d+\\p{L}*|\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    Matcher m = pattern.matcher(word);
                    if (m.find()) {
                        bufferedWriter.write(word);
                        bufferedWriter.write(" ");
                    }
                }
            }
        }

    }
}
