package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread target;

    public LoggingStateThread(Thread target) {

        this.target = target;
        this.setDaemon(true);
    }

    @Override
    public void run() {

        State state = target.getState();
        System.out.println(state);
        while (true){
            State newState = target.getState();
            if (newState!=state){
                System.out.println(newState);
                state = newState;
            }else if (newState == State.TERMINATED){
                break;

            }
        }
    }
}
