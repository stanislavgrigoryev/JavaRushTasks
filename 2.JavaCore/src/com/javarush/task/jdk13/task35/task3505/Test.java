package com.javarush.task.jdk13.task35.task3505;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<? super Plant> list = new ArrayList<>();

        list.add(new Plant());
        System.out.println( list.get(0).getClass().getName() );
    }

    private static class Plant {
    }

    private static class Flower extends Plant {
    }
    private static class Rose extends Flower{

    }
}
