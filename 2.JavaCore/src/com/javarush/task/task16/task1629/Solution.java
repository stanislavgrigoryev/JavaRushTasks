package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();

    }

    public static class Read3Strings extends Thread {
        Scanner scanner = new Scanner(System.in);
        String str1;
        String str2;
        String srt3;


        @Override
        public void run() {
            str1 = scanner.nextLine();
            str2 = scanner.nextLine();
            srt3 = scanner.nextLine();

            try {
                new Read3Strings().join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        public void printResult() {

            System.out.println(str1 + " " + str2 + " " + srt3);

        }
    }

    //add your code here - добавьте код тут
}
