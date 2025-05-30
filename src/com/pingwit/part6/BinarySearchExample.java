package com.pingwit.part6;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
//        int[] intArray = {90, 80, 70, 60, 50};
        int[] intArray = {50, 60, 70, 80, 90};

        Arrays.sort(intArray);

        int toFind = 70;
        int index = -1;

        int leftBorder = 0;
        int rightBorder = intArray.length - 1;

        while (leftBorder <= rightBorder) {
            int mid = (leftBorder + rightBorder) / 2;
            int currentValue = intArray[mid];

            if (currentValue == toFind) {
                index = mid;
                break;
            }

            if (currentValue < toFind) {
                leftBorder = mid +1;
            }
            else {
                rightBorder = mid -1;
            }
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println(index);
        System.out.println(intArray[index]);
    }
}
