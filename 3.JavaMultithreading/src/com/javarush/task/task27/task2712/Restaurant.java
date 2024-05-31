package com.javarush.task.task27.task2712;


import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) throws IOException {
        Tablet tablet = new Tablet(4);
        for (int i = 0; i < 4; i++) {
            tablet.createOrder();
        }
        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);
        Waiter waiter = new Waiter();
        Cook cook1 = new Cook("Stepan");
        cook1.addObserver(waiter);
    }//
}

