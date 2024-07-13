package com.javarush.task.sql.task15.task1503;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "person_id")
public class Client extends Person {

    private Long person_id;
    @Column(name = "bank")
    private String bank;
}
