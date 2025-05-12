package com.pingwit.part6;

import java.util.Arrays;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        int[][] TwoDimensionsArray = new int[5][4];

        System.out.println(Arrays.toString(TwoDimensionsArray));

        for (int i = 0; i < TwoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(TwoDimensionsArray[i]));
        }

        TwoDimensionsArray[1][2] = 33;
        System.out.println(TwoDimensionsArray[1][2]);

        for (int i = 0; i < TwoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(TwoDimensionsArray[i]));
        }

        int[][] InitArray = {
                {22,33,44},
                {55},
                {66,77,13}
        };

        for (int i = 0; i < InitArray.length; i++) {
            System.out.println(Arrays.toString(InitArray[i]));
        }
    }
}
