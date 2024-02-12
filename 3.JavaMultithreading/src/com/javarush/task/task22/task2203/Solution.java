package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/


public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null) {
            throw new TooShortStringException();
        }
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '\t') {
                count++;
            }
        }
        if (count < 2) {
            throw new TooShortStringException();
        }
        int i1 = string.indexOf("\t");
        int secondTabIndex = string.indexOf('\t', i1 + 1);

        return string.substring(i1 + 1, secondTabIndex);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
