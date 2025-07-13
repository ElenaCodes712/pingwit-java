package com.pingwit.part8.homework.task1;

public class CarArray {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Volkswagen", "Polo", 4),
                new Car("Audi", "A3", 4),
                new Car("Volkswagen", "T-Roc", 4),
        };

        openAudiDoors(cars);
    }

    public static void openAudiDoors(Car[] cars) {
        for (Car car : cars) {
            if (car.brand.equals("Audi")) {
                System.out.println(car);
                car.openDoors();
            }
        }
    }
}
