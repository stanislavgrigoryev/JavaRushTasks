package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {


    public static void main(String[] args) throws IOException, ParseException {
       PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(System.in));
       personScannerAdapter.read();

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {

            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] split = fileScanner.nextLine().split(" ");
            String lastName = split[0];
            String name = split[1];
            String middleName = split[2];
//            String day = split[3];
//            String month = split[4];
//            String year = split[5];


            GregorianCalendar date = new GregorianCalendar(Integer.parseInt(split[5]),Integer.parseInt(split[4])-1,Integer.parseInt(split[3]));
            Date time = date.getTime();

            return new Person(name, middleName, lastName, time);
        }



        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}

