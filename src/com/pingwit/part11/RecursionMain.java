package com.pingwit.part11;

public class RecursionMain {
    public static void main(String[] args) {
        show(0, 100_000);
    }

    private static void show(int from, int to) {
        if (from > to) {
            return;
        }

        System.out.println(from);
        show(++from, to);
    }
}
