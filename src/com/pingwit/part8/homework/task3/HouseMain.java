package com.pingwit.part8.homework.task3;

public class HouseMain {
    public static void main(String[] args) {
        House[] houses = new House[5];

        houses[0] = new House(6, 12, false, HouseType.APARTMENTS);
        houses[1] = new House(2, 5, false, HouseType.HOUSE);
        houses[2] = new House(1, 12, false, HouseType.HOUSE);
        houses[3] = new House(10, 30, false, HouseType.APARTMENTS);
        houses[4] = new House(7, 20, false, HouseType.APARTMENTS);

        for (House house : houses) {
            house.turnOnHeating(5, 10);
        }
    }
}

