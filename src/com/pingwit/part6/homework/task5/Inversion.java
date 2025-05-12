package com.pingwit.part6.homework.task5;

import java.util.Arrays;

public class Inversion {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int lastIndex = array.length - 1 - i;
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
