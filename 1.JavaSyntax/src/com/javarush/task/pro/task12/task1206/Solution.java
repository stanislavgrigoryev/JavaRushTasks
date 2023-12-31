package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                count++;
            }

        }
        return count;
    }


    public static int countLetters(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
//        char[] chars = string.toCharArray();
//       return (int)IntStream.range(0, chars.length).filter(i -> Character.isSpaceChar(chars[i])).count();
       int count = 0;
        for (char c : string.toCharArray()) {
           if (  Character.isSpaceChar(c)){
                count++;
          }
     }
        return count;
    }
}
