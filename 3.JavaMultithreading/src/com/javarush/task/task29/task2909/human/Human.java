package com.javarush.task.task29.task2909.human;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private static int nextId = 0;
    @Getter
    private int id;
    @Getter
    @Setter
    protected int age;
    @Getter
    @Setter
    protected String name;
    private List<Human> children = new ArrayList<>();

    protected Size size;
    @Getter
    @Setter
    private BloodGroup bloodGroup;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public List<Human> getChildren() {

        return Collections.unmodifiableList(children);
    }

    public void live() {

    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public void addChild(Human human) {
        children.add(human);

    }

    public void removeChild(Human human) {
        children.remove(human);
    }

    public void printData() {

        System.out.println(getPosition() + ": " + name);
    }

    public String getPosition() {
        return "Человек";
    }

    public static class Size {
        public int height;
        public int weight;
    }
}