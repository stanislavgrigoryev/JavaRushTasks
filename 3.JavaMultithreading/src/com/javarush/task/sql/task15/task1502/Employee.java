package com.javarush.task.sql.task15.task1502;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("2")
public class Employee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company")
    private String company;
}
