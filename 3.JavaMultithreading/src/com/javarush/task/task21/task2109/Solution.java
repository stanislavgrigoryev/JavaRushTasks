package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();

        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            B b = (B) super.clone();
            b.name = name;
            return b;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(1, 2);
        B b = new B(2,2, "b");
        System.out.println(a.getI() + " " + a.getJ());

    }
}
