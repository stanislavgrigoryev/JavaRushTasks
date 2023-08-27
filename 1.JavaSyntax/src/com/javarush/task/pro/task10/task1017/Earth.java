package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        SouthAmerica southAmerica = new SouthAmerica(3000);
        Africa africa = new Africa(1000);
        Antarctica antarctica = new Antarctica(2000);
        Australia australia = new Australia(4000);
        Eurasia eurasia = new Eurasia(2000);
        NorthAmerica northAmerica = new NorthAmerica(1000);
    }
}
