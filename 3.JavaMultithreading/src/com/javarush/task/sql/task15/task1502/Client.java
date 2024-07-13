package com.javarush.task.sql.task15.task1502;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("1")
public class Client extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank")
    private String bank;
}
