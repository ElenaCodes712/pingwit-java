package com.pingwit.part9.point4;

public class ImmutableWarehouseExample {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3};
        Warehouse neptun = new Warehouse(
                "Neptun",
                new int[]{0,1,2,3},
                new Book[]{new Book("Harry Potter"), new Book("Home Alone") }
        );

        System.out.println(neptun);

        neptun.numbers()[0] = 777;
        neptun.books()[0].setName("Operacja Y");

        System.out.println(neptun);
    }
}
