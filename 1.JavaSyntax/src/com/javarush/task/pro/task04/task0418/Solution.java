package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean bo = scanner.nextBoolean();
        if (bo == Boolean.FALSE) {
            System.out.println((int)Math.floor(glass));
        } else if (bo == Boolean.TRUE) {
            System.out.println((int) Math.ceil(glass));
        }
    }
}