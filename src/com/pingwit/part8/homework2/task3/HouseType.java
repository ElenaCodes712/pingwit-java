package com.pingwit.part8.homework2.task3;

public enum HouseType {
    APARTMENT("многоквартирный дом"),//сейчас это не критично, но весь код старайся писать на английском
    COUNTRY_HOUSE("загородный дом");

    private final String type;

    HouseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
