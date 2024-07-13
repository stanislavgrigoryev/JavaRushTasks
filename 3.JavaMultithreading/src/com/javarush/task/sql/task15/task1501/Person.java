package com.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

@Table(name = "person")
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

}
