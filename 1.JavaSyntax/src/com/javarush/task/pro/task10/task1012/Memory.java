package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        System.out.println(Arrays.toString(memory));
        executeDefragmentation(memory);
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = array.length; i >=0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] == null) {
                    array[j] = array[j + 1];
                    array[j + 1] = null;
                }

            }
            System.out.println();
            System.out.println(Arrays.toString(array));
        }
    }
}
