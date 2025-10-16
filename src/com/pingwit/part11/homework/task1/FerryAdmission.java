package com.pingwit.part11.homework.task1;

public class FerryAdmission {
    public boolean check(Vehicle[] vehicles) {
        int totalPassengers = 0;
        double totalWeight = 0;
        final int ALLOWED_PASSENGERS = 50;
        final int ALLOWED_WEIGHT = 15;


        for (Vehicle v : vehicles) {
            totalPassengers += v.getPassengers();
            totalWeight += v.getWeight();
        }

        return totalPassengers <= ALLOWED_PASSENGERS && totalWeight <= ALLOWED_WEIGHT;
    }
}
