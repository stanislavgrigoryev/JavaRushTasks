package com.javarush.task.task29.task2909.car;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract class Car {
    public static final int TRUCK = 0;
    public static final int SEDAN = 1;
    public static final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;
    @Getter
    @Setter
    private boolean driverAvailable;
    private final int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void fill(double numberOfLiters) throws IllegalAccessException {
        if (numberOfLiters < 0) {
            throw new IllegalAccessException();
        }
        fuel += numberOfLiters;

    }

    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {

        return isSummer(date, summerStart, summerEnd) ?
                getSummerConsumption(length) : getWinterConsumption(length);
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if (!canPassengersBeTransferred()) {
            return 0;
        }
        return numberOfPassengers;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        } else fastenDriverBelt();
    }

    public void fastenPassengersBelts() {
        fastenDriverBelt();
    }

    public void fastenDriverBelt() {

    }

    public abstract int getMaxSpeed();

    public static Car create(int type, int numberOfPassengers) {
        if (type == TRUCK) {
            return new Truck(numberOfPassengers);
        } else if (type == SEDAN) {
            return new Sedan(numberOfPassengers);
        } else if (type == CABRIOLET) {
            return new Cabriolet(numberOfPassengers);
        } else return null;
    }

    public boolean isSummer(Date date, Date summerStart, Date summerEnd) {
        return date.after(summerStart) && date.before(summerEnd);
    }

    public double getWinterConsumption(int length) {
        return length * winterFuelConsumption + winterWarmingUp;
    }

    public double getSummerConsumption(int length) {
        return length * summerFuelConsumption;
    }

    private boolean canPassengersBeTransferred() {
        return isDriverAvailable() && fuel > 0;

    }

}