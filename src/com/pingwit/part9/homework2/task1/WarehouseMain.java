package com.pingwit.part9.homework2.task1;

public class WarehouseMain {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(new int[]{0, 1, 2, 3, 4, 5});

        int currentIndex = 0;

        System.out.println(WarehouseNextNumber.next(warehouse.numbers(), currentIndex));
    }
}
