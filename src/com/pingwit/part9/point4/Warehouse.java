package com.pingwit.part9.point4;

import java.util.Arrays;

public record Warehouse(
        String name,
        int[] numbers,
        Book[] books
) {
    @Override
    public int[] numbers() {
        /*int[] clone = new int[numbers.length];
        for (int i = 0; i < clone.length ; i++) {
            clone[i] = numbers[i];
        }*/

        int[] clone = numbers.clone();

        return clone;
    }

    @Override
    public Book[] books() {
        return books.clone();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "name='" + name + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
