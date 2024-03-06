package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] split = null;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                split = string.split(" ");
            }
        }
        StringBuilder result = getLine(split);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0){
            return new StringBuilder();
        }
        ArrayList<StringBuilder> builderList = new ArrayList<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);

            ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                String firstWord = builder.toString();
                String firstStart = firstWord.substring(0, 1);
                String firstEnd = firstWord.substring(firstWord.length() - 1);
                String second = list.get(i);
                String secondStart = second.substring(0, 1);
                String secondEnd = second.substring(second.length() - 1);
                if (firstStart.equalsIgnoreCase(secondEnd)) {
                    builder.insert(0, second + " ");
                } else if (firstEnd.equalsIgnoreCase(secondStart)) {
                    builder.append(" " + second);
                } else {
                    list.remove(second);
                    i--;
                    list.add(second);
                    count++;
                    if (count > Math.pow(words.length, 2)) {
                        break;
                    }
                }
            }
            builderList.add(builder);
        }
        return builderList.stream().max(Comparator.comparingInt(o -> o.length())).get();

    }
}

