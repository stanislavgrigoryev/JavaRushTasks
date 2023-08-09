package com.javarush.task.jdk13.task15.task1503;

/* 
Мужчина или женщина?
*/

public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Man man = new Man();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
