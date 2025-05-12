package com.pingwit.part6.homework.task4;

import java.lang.reflect.Array;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] intArray = new int[11][11];

        for (int i = 1; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length; j++) {
                intArray[i][j] = i * j;
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


