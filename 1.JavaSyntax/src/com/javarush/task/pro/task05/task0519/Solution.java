package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.IntStream;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
//        boolean b = Arrays.stream(array).anyMatch(x -> x == element);
//        System.out.println(b);
        Arrays.binarySearch(array, element);
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
