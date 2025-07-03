package com.pingwit.part6.homework;

public class LongestSequence {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1};

        int currentLength = 1;
        int maxLength = 1;
        int maxStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStartIndex = i - currentLength + 1;
            }
            if (array[i] != array[i - 1]) {
                currentLength = 1;
            }
        }
        System.out.println("Длина последовательности: " + maxLength);
        System.out.println("Начинается с элемента под индексом: " + maxStartIndex);
    }
}
