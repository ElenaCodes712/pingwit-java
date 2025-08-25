package com.pingwit.part10.homework.task2;

public class Gearbox {
    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 7;

    private int currentGear = 0;

    public void shiftUp() {
        if (currentGear == MAX_GEAR) {
            System.out.println("You've already the maximum gear");
        } else {
            currentGear++;
            System.out.println("You shifted into " + currentGear);
        }
    }

    public void shiftDown() {
        if (currentGear == MIN_GEAR) {
            System.out.println("Your transmission is in neutral gear");
        } else {
            currentGear--;
            System.out.println("You shifted into " + currentGear);
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
