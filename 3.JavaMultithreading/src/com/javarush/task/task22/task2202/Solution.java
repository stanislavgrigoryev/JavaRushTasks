package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        int count = 0;
        if (string == null) {
            throw new TooShortStringException();
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                count++;
            }
        }
        if (count < 4) {
            throw new TooShortStringException();
        }
        int spaceCount = 0;
        int fourthSpaceIndex = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                spaceCount++;
                if (spaceCount == 4) {
                    fourthSpaceIndex = i;
                    break;
                }
            }
        }

        int firstSpaceIndex = string.indexOf(" ");
        String textBetweenSpaces = string.substring(firstSpaceIndex, fourthSpaceIndex);
        String s = string.substring(firstSpaceIndex).trim();
        String[] split = s.split(" ");
        String string1 = textBetweenSpaces.trim() + " " + split[3];

        return string1;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
