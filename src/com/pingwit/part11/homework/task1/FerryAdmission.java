package com.pingwit.part11.homework.task1;

public class FerryAdmission {
    public boolean check(Vehicle[] vehicles) {
        int totalPassengers = 0;
        double totalWeight = 0;

        for (Vehicle v : vehicles) {
            totalPassengers += v.getPassengers();
            totalWeight += v.getWeight();
        }

        boolean allowed = (totalPassengers <= 50) && (totalWeight < 15);

        if (allowed) {
            System.out.println("Рейс разрешён");
        } else {
            System.out.println("Рейс запрещён");
        }
        return allowed;
    }
}
