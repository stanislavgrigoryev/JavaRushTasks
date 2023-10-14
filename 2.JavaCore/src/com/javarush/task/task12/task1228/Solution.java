package com.javarush.task.task12.task1228;

/* 
Интерфейсы к классу Human
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary extends Worker {
        public default void workLazy(){
        }
    }

    public static interface Miner {
        public default void workVeryHard(){

        }
    }

    public static class Human implements Secretary, Businessman, Worker{

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
