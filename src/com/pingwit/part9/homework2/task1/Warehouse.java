package com.pingwit.part9.homework2.task1;

import java.util.Arrays;

public record Warehouse(
        int[] numbers
) {
    @Override
    public int[] numbers() {
        return numbers.clone();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
