package com.pingwit.part9.homework2.task1;

public class WarehouseNextNumber { // метод next() должен быть внутри Warehouse. Этот класс можно удалить
    public static int next(int[] numbers, int currentIndex) {
        for (int i = 0; i < numbers.length; i++) {
            currentIndex = numbers[i];
            System.out.println(currentIndex);
        }
        return numbers[0];
    }
}
