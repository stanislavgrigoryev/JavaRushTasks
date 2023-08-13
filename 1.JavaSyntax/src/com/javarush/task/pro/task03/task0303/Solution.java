package com.javarush.task.pro.task03.task0303;

import java.util.Scanner;

/* 
Школа или институт
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
