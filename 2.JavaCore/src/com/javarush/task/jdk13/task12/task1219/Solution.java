package com.javarush.task.jdk13.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim{

        @Override
        public void swim() {
            System.out.println("Бежит");
        }

        @Override
        public void run() {
            System.out.println("Летает");

        }
    }

    public class Duck implements CanFly,CanSwim, CanRun {

        @Override
        public void fly() {
            System.out.println("ggbtb");
        }

        @Override
        public void run() {
            System.out.println("htna");

        }

        @Override
        public void swim() {
            System.out.println("atbrtn");

        }
    }

    public class Penguin implements CanRun, CanSwim {

        @Override
        public void run() {
            System.out.println("abrtb");
        }

        @Override
        public void swim() {
            System.out.println("abrtn");

        }
    }

    public class Airplane implements CanFly{

        @Override
        public void fly() {
            System.out.println("tratn");
        }
    }
}
