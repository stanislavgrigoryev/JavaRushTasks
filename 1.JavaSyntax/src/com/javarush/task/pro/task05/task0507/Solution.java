package com.javarush.task.pro.task05.task0507;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//        System.out.println(max);
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}
