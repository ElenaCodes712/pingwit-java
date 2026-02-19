package com.pingwit.part8.homework2.task3;

public class HouseMain {
    public static void main(String[] args) {
        House[] houses = {
                new House(9, 15, false, HouseType.APARTMENT),
                new House(5, 10, false, HouseType.APARTMENT),
                new House(1, 8, false, HouseType.COUNTRY_HOUSE),
                new House(2, 6, false, HouseType.COUNTRY_HOUSE),
                new House(6, 13, false, HouseType.APARTMENT),
                new House(8, 16, false, HouseType.APARTMENT)
        };

        for (House house : houses) {
            house.turnOnHeating();
        }
    }
}
