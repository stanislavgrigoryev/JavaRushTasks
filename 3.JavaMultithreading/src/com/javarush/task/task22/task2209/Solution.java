package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

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
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        list.remove(0);
        StringBuilder builder = new StringBuilder(words[0]);
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
            }
        }
        return builder;
    }
}
