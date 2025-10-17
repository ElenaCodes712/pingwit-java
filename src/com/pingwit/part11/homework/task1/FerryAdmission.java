package com.pingwit.part11.homework.task1;

public class FerryAdmission {
    public boolean check(Vehicle[] vehicles) {
        int totalPassengers = 0;
        double totalWeight = 0;
        final int ALLOWED_PASSENGERS = 50; // сейчас это final константа(переменная в прошлом) внутри метода, сделай их константами класса
        final int ALLOWED_WEIGHT = 15;// сейчас это final константа(переменная в прошлом) внутри метода, сделай их константами класса

// лишняя строка, давай удалим
        for (Vehicle v : vehicles) {
            totalPassengers += v.getPassengers();
            totalWeight += v.getWeight();
        }

        return totalPassengers <= ALLOWED_PASSENGERS && totalWeight <= ALLOWED_WEIGHT;
    }
}
