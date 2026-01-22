package com.pingwit.part11.homework.task2;

public class FruitsCounter {
    private FruitsCounter() {
    }

    public static int countByType(Branch branch, Fruits... countingFruitTypes) {
        if (branch == null || countingFruitTypes == null) {
            return 0;
        }

        int count = 0;

        for (Fruits fruit : branch.getFruits()) {
            boolean contains = contains(fruit, countingFruitTypes);
            if (contains) {
                count++;
            }
        }

        for (Branch child : branch.getChildren()) {
            if (child != null) {
                count += countByType(child, countingFruitTypes);
            }
        }

        return count;
    }

    private static boolean contains(Fruits search, Fruits[] fruits) { //[BANANA, COCONUT]
        for (Fruits fruit : fruits) {
            if (fruit == search) {
                return true;
            }
        }

        return false;
    }
}
