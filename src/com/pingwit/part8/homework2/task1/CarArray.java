package com.pingwit.part8.homework2.task1;

public class CarArray {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Volkswagen", "Polo", 4),
                new Car("Audi", "A3", 4),
                new Car("Volkswagen", "T-Roc", 4),
        };

        for (Car car : cars) {
            car.openAudiDoors();
        }
    }
}
