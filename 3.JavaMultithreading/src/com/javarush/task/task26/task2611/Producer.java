package com.javarush.task.task26.task2611;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable{
   private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            map.put(String.valueOf(i), "Some text for " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "thread was terminated");
            }
        }
    }
}
