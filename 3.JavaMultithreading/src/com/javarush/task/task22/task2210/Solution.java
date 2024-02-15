package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));

    }

    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        int count = stringTokenizer.countTokens();
        String [] strings = new String[count];
        for (int i = 0; i < count; i++) {
            strings[i] = stringTokenizer.nextToken();
        }
        return strings;
    }
}
