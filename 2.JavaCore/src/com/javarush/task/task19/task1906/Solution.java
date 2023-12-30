package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;


/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerNameFile = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = readerNameFile.readLine();
        String nameFile2 = readerNameFile.readLine();
        FileReader fileReader = new FileReader(nameFile1);
        FileWriter fileWriter = new FileWriter(nameFile2);
        int count = 0;
        while (fileReader.ready()) {
            int read = fileReader.read();
            count++;
            if (count % 2 == 0) {
                fileWriter.write(read);
            }
        }


        readerNameFile.close();
        fileReader.close();
        fileWriter.close();
    }
}
