package com.javarush.task.task29.task2909.human;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends UniversityPerson {
    @Getter
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    @Getter
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    public void incAverageGrade(double delta) {
        setAverageGrade(getAverageGrade() + delta);
    }

    @Override
    public String getPosition() {
        return "Студент";
    }
}