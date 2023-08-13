package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 10){
            scanner.hasNextLine();
            String name = scanner.nextLine();
            System.out.println(name + text);
            count++;
        }
    }
}
