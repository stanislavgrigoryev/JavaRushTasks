package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();
        MyThread4 myThread4 = new MyThread4();
        MyThread5 myThread5 = new MyThread5();
        threads.add(myThread1);
        threads.add(myThread2);
        threads.add(myThread3);
        threads.add(myThread4);
        threads.add(myThread5);
    }

    public static void main(String[] args) {

    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            if (isInterrupted()) {
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }

        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }


    public static class MyThread4 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {

            }

        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class MyThread5 extends Thread {
        String key = "";
        int sum;
        int number;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                number = Integer.parseInt(scanner.nextLine());
                if (key.equals("N")) {
                    break;
                }
                sum = sum + number;
                System.out.println(sum);
            }
        }
    }
}

