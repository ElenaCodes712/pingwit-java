package com.pingwit.part4.homework.task1;

public class RunningDistance {
    public static void main(String[] args) {
        double distance = 10;
        double totalDistance = 0.0;
        double factor = 1.1;

        for (int day = 1; day <= 7; day++) {
            totalDistance = totalDistance + distance;
            distance = distance *factor;
        }
        System.out.println(totalDistance);
    }
}
