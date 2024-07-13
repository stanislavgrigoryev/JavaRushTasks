package com.javarush.task.sql.task15.task1504;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends Person {
    @Column(name = "bank")
    private String bank;
}
