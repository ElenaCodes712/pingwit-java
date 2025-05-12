package com.pingwit.part6.homework.task6;

import java.util.Arrays;

public class EvenElements {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tempArray = new int[intArray.length];
        int counter = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) {
                tempArray[i] = intArray[i];
                counter++;
            }
        }

        int[] evenArray = new int[counter];
        int index = 0;
        for (int number : intArray) {
            if (number % 2 == 0) {
                evenArray[index] = number;
                index++;
            }
        }
        System.out.println("Source array: " + Arrays.toString(intArray));
        System.out.println("Array containing only even numbers: " + Arrays.toString(evenArray));
    }
}
