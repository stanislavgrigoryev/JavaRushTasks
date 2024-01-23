package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution savedObject = new Solution(4);
        Solution loadObject = new Solution(5);
        System.out.println(new Solution(4));
        String file = "fileS";

        FileOutputStream fileOutput = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(savedObject);
        fileOutput.close();
        outputStream.close();

        FileInputStream fiStream = new FileInputStream(file);
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        loadObject = (Solution) objectStream.readObject();

        System.out.println(savedObject.string.equals(loadObject.string));
        fiStream.close();
        objectStream.close();
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
