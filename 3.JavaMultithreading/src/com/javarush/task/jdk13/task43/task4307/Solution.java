package com.javarush.task.jdk13.task43.task4307;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.Objects;

/* 
Шило на мыло
*/

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
        int count = 0;
        for (String value : values) {
           if (Objects.isNull(values)){
               continue;
           } else if (Objects.nonNull(value)){
                System.out.println(value);
                count++;
            }
           if (count == 1){
               break;
           }
        }
    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
        for (String o : values) {
            String string = Objects.requireNonNullElse(o, defaultValue);
            System.out.println(string);
        }
    }
}
