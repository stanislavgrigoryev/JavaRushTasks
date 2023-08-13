package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String text = scanner.nextLine();
       int sum = 0;
        if (text.equals("ENTER")){
            while (scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum*=number;
                System.out.println(sum); 
        }
       }
    }
}