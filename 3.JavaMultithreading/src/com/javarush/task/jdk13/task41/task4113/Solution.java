package com.javarush.task.jdk13.task41.task4113;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* 
Тотальная итерация
*/

public class Solution {

    public static void main(String[] args) {
        getIterators().stream()
                .map(i -> i.getClass().getCanonicalName())
                .sorted()
                .forEach(System.out::println);
    }

    public static List<Iterator> getIterators() {
        List<Iterator> result = new ArrayList<>();
        result.add(new HashMap().entrySet().iterator());
        result.add(new HashMap().keySet().iterator());
        result.add(new HashMap().values().iterator());
        result.add(new TreeMap().entrySet().iterator());
        result.add(new TreeMap().keySet().iterator());
        result.add(new TreeMap().values().iterator());
        result.add(new LinkedBlockingQueue().iterator());
        result.add(new LinkedHashMap().entrySet().iterator());
        result.add(new LinkedHashMap().keySet().iterator());
        result.add(new LinkedHashMap().values().iterator());
        result.add(new Vector().iterator());
        result.add(new DelayQueue().iterator());
        result.add(new PriorityQueue().iterator());
        result.add(new ArrayList().iterator());
        result.add(new ArrayList().listIterator());
        result.add(new LinkedList().iterator());
        result.add(Collections.emptyIterator());
        result.add(Collections.emptyListIterator());
        result.add(new ConcurrentHashMap().entrySet().iterator());
        result.add(new ConcurrentHashMap().keySet().iterator());
        result.add(new ConcurrentHashMap().values().iterator());

        return result;
    }
}
