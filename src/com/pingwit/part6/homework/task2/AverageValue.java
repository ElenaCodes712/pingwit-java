package com.pingwit.part6.homework.task2;

public class AverageValue {
    public static void main(String[] args) {

        double[] doubleArray = {1, 2, 3, 4, 5, 6};
        double averageValue = 0;
        double sum = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i];
        }

        averageValue = sum / doubleArray.length;

        System.out.println("The average value of array is: " + averageValue);
    }
}
