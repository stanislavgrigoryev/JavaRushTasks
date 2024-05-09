package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {

        String line = bis.readLine();
        return line;
    }
    public static int readInt() throws IOException {
        String number = bis.readLine();
        return Integer.parseInt(number);
    }
}
