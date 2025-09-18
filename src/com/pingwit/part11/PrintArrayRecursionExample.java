package com.pingwit.part11;

public class PrintArrayRecursionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13};

        printArray(numbers, 0);
    }

    private static void printArray(int[] numbers, int i) {
        if(i == numbers.length) {
            return;
        }
        printArray(numbers, i+1);
        System.out.println(numbers[i]);
    }
}
