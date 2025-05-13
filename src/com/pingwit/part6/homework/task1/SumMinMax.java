package com.pingwit.part6.homework.task1;

import java.util.Arrays;
import java.util.Scanner;

public class SumMinMax {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter one number: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number; // ты можешь выполнить эту операцию 1 раз за пределами цикла сложив evem+odd, так будет оптимальнее
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The sum of numbers is: " + sum);
        System.out.println("The smallest numbers is: " + min);
        System.out.println("The biggest numbers is: " + max);
// лишняя строка, давай удалим
// лишняя строка, давай удалим
    }
}
