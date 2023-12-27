package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception{

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            while (bufferedReader.ready()){
                String text = bufferedReader.readLine();
                String name = text.replaceAll("\\d", "").trim();
                String date = text.replaceAll("\\D", " ").trim();
                Person person = new Person(name, dateFormat.parse(date));
                PEOPLE.add(person);
            }
            for (Person person : PEOPLE) {
                System.out.println(person.getName() + " " + person.getBirthDate());
            }
        }
    }
}
