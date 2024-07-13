package com.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

@Table(name = "client")
@Entity
public class Client extends Person{

    @Column(name = "bank")
    private String bank;
}
