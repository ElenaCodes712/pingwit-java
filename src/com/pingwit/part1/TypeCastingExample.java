package com.pingwit.part1;

public class TypeCastingExample {
    public static void main(String[] args) {
        // ++ Erweiterung
        byte myByte = 127;
        int myInt = myByte;
        System.out.println(myInt);

        double myDouble = myInt;
        System.out.println(myDouble);

        // --
        int highInt = 200;
        byte highByte = (byte) highInt;
        System.out.println(highByte); // 2^8=256 -> -128 +127 -> 200-256 -> -56

        int highInt2 = 400;
        byte highByte2 = (byte) highInt2;
        System.out.println(highByte2); // 400-256 -> 144 -> 256-144 -> 112

        double highDouble = 100.9;
        highInt = (int) highDouble;
        System.out.println(highInt); // no mathematical rounding
    }
}
