package com.javarush.task.sql.task15.task1504;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Employee extends Person {
    @Column(name = "company")
    private String company;
}
