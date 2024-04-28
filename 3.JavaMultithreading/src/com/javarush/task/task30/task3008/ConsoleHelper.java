package com.javarush.task.task30.task3008;

import java.io.*;

public class ConsoleHelper {
    private static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        String read = null;

        while (true) {
            try {
                read = console.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
                read = readString();
            }
        }
        return read;
    }

    public static int readInt(){
        int number;
        try {
            number = Integer.parseInt(readString());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            number = readInt();
        }

        return number;
    }
}
