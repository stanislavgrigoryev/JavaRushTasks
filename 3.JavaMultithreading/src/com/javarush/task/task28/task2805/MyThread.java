package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static final AtomicInteger atomicInt = new AtomicInteger(1);

    {
        int priority = atomicInt.getAndIncrement();
        if (priority > MAX_PRIORITY) {
            priority = MIN_PRIORITY;
        }
        atomicInt.set(priority);
        setPriority(atomicInt.getAndIncrement());
        if (getThreadGroup() != null && getThreadGroup().getMaxPriority() < priority) {
            setPriority(getThreadGroup().getMaxPriority());
        }
    }


    public MyThread() {
        super();
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }
}
