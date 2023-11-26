package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)){
            PrepareMyTest annotation = c.getAnnotation(PrepareMyTest.class);
            String[] strings = annotation.fullyQualifiedNames();
            Arrays.stream(strings).forEach(System.out::println);
            return true;
        }
        return false;
    }

    public static <T> boolean printValues(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)){
            PrepareMyTest annotation = c.getAnnotation(PrepareMyTest.class);
            Class<?>[] value = annotation.value();
            Arrays.stream(value).forEach(aClass -> System.out.println(aClass.getSimpleName()));
            return true;
        }

        return false;
    }
}
