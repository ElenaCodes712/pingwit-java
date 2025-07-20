package com.pingwit.part8.homework.task3;

public enum HouseType {
    APARTMENTS("Многоквартирный дом"),
    HOUSE("Загородный дом");

    private final String type;

    HouseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

