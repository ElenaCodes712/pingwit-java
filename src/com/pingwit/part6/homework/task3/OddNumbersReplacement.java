package com.pingwit.part6.homework.task3;

import java.util.Arrays;

public class OddNumbersReplacement {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
