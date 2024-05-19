package com.javarush.task.task27.task2712;




import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) throws IOException {
        Tablet tablet = new Tablet(4);
        for (int i = 0; i < 4; i++) {
            tablet.createOrder();
        }

    }
}

