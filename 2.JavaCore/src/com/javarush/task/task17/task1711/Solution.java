package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    //      Миронов м 15-Apr-1990 Миронова ж 25-Apr-1997
    //  0   1       2    3         4       5   6
    public static synchronized void main(String[] args) throws ParseException {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        String name = args[i];
                        String sex = args[i + 1];
                        Date date = input.parse(args[i + 2]);
                        if (sex.equals("м")) {
                            person = Person.createMale(name, date);
                        } else if (sex.equals("ж")) {
                            person = Person.createFemale(name, date);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(args[i + 1]);
                            if (args[i + 2].equals("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i + 2].equals("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(input.parse(args[i + 3]));
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            System.out.println(person.getName() + " "
                                    + (person.getSex().equals(Sex.MALE) ? "м" : "ж") + " "
                                    + output.format(person.getBirthDate()));
                        }
                    }
                }
                break;
        }
    }
}
