package com.pingwit.part8.homework.task1;

public class CarArray {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Volkswagen", "Polo", 4),
                new Car("Audi", "A3", 4),
                new Car("Volkswagen", "T-Roc", 4),
        };

        openAudiDoors(cars); // openAudiDoors -> openDoors и в метод добавь String carBrand, получится openDoors(String carBrand, Car[] cars)
    }

    public static void openAudiDoors(Car[] cars) { // не критично, но здесь тоже будет хорошим решением модификатор private. Если метод не нужен для внешнего использования, делай его private
        for (Car car : cars) {
            if (car.getBrand().equals("Audi")) {
                System.out.println(car);
                car.openDoors();
            }
        }
    }
}
