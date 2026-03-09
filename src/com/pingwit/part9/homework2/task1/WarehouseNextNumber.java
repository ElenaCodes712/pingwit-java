package com.pingwit.part9.homework2.task1;

public class WarehouseNextNumber {
    public static int next(int[] numbers, int currentIndex) {
        for (int i = 0; i < numbers.length; i++) {
            currentIndex = numbers[i];
            System.out.println(currentIndex);
        }
        return numbers[0];
    }
}
