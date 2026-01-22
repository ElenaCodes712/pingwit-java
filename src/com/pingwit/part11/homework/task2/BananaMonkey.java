package com.pingwit.part11.homework.task2;

public class BananaMonkey implements Monkey {
    @Override
    public int countFruits(Branch branch) {
        return FruitsCounter.countByType(branch, Fruits.BANANA);
    }
}
