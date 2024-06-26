package com.javarush.task.task27.task2712.ad;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Advertisement {
    private Object content;
    private String name;
    private long initialAmount;
    private int hits;
    private int duration;
    private long amountPerOneDisplaying;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        try {
            if (hits == 0) {
                throw new ArithmeticException();
            } else {
                amountPerOneDisplaying = initialAmount / hits;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {

        return amountPerOneDisplaying;
    }

    public void revalidate() {

        if (hits < 1) {
            throw new UnsupportedOperationException();
        }
        hits--;
    }
}
