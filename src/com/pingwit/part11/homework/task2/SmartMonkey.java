package com.pingwit.part11.homework.task2;

import static com.pingwit.part11.homework.task2.Fruits.BANANA;
import static com.pingwit.part11.homework.task2.Fruits.COCONUT;

public class SmartMonkey implements Monkey {
    @Override
    public int countFruits(Branch branch) {
        return FruitsCounter.countByType(branch, COCONUT, BANANA);
    }
}
