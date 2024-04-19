package com.javarush.task.task24.task2413;

public class Stand extends BaseObject {
    private double speed;
    private double direction;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }

}
