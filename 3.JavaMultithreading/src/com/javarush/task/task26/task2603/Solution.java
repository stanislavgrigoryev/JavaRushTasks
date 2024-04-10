package com.javarush.task.task26.task2603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 
Убежденному убеждать других не трудно
*/

public class Solution {

    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T>[] comparators;

        public  CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T o1, T o2) {
            for (Comparator<T> comparator : comparators) {
               int result = comparator.compare(o1, o2);
                if (result != 0){
                    return result;
                }
            }
           return 0;
        }
    }

    public static void main(String[] args) {

    }
}
