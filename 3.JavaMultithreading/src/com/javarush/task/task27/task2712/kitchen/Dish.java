package com.javarush.task.task27.task2712.kitchen;

import java.util.StringJoiner;

public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

    public static String allDishesToString() {
        Dish[] dishes = Dish.values();
        StringJoiner joiner = new StringJoiner(", ", "\"", "\"");
        for (Dish dish : dishes) {
            joiner.add(dish.toString());
        }
        String result = String.format("%s", joiner);
        return result;
    }
}
