package com.pingwit.part9.homework.task1;

import java.util.Arrays;

public class Warehouse {
    private final int[] items;
    private int currentIndex = 0;

    public Warehouse(int[] initialItems ) {
        this.items = initialItems.clone();
    }

    public int next() {
        int value = items[currentIndex];
        currentIndex = (currentIndex + 1) % items.length;
        return value;
    }

    public int[] getArray() {
        return items.clone();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}

