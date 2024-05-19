package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {


    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();

    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> order = new ArrayList<>();
        writeMessage("Выберите блюдо:");
        writeMessage(Dish.allDishesToString());

        while (true) {
            String string = readString();
            if (string.equals("exit")) {
                break;
            }
            boolean found = false;
            for (Dish dish : Dish.values()) {
                if (string.equalsIgnoreCase(dish.name())) {
                    order.add(dish);
                    found = true;
                    break;
                }
            } if (!found){
                ConsoleHelper.writeMessage("Такого блюда нет в меню. Пожалуйста, выберите блюдо из списка.");
            }
        }
        return order;
    }
}
