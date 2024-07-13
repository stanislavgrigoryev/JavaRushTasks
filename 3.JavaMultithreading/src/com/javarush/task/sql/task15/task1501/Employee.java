package com.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

@Table(name = "employee")
@Entity
public class Employee extends Person{

    @Column(name = "company")
    private String company;

}
