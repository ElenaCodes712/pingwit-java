package com.pingwit.part10.homework2.task2;

public class Gearbox {
    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 7;
    private int currentGear = 0;

    public void shiftGearUp() {
        if (currentGear == MAX_GEAR) {
            System.out.println("You have already the maximum gear");
        } else {
            currentGear++;
            System.out.println("You shifted up into " + currentGear + " gear");
        }
    }

    public void shiftGearDown() {
        if (currentGear == MIN_GEAR) {
            System.out.println("Your transmission is in neutral gear");
        } else {
            currentGear--;
            System.out.println("You shifted down into " + currentGear + " gear");
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setNeutral() {
        currentGear = MIN_GEAR;
    }
}
