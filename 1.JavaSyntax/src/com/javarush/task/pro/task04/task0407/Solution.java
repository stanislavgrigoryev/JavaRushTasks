package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        while (count <= 100) {
            if (count%3 == 0) {
                count++;
                continue;
            }
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}
