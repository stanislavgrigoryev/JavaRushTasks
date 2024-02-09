package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"}, "12");
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Plant plant = (Plant) o;
            return Objects.equals(name, plant.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;
        private String age;

        public String getAge() {
            return age;
        }

        public Tree(String name, String[] branches, String age) {
            super(name);
            this.branches = branches;
            this.age = age;
        }


        public String[] getBranches() {

            return branches;
        }

        @Override
        protected Tree clone() throws CloneNotSupportedException {
            Tree tree = (Tree) super.clone();
            tree.branches = this.branches.clone();
            return tree;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Tree tree = (Tree) o;
            return Arrays.equals(branches, tree.branches) && Objects.equals(age, tree.age);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(super.hashCode(), age);
            result = 31 * result + Arrays.hashCode(branches);
            return result;
        }
    }
}
