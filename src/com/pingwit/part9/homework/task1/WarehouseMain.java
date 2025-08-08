package com.pingwit.part9.homework.task1;

public class WarehouseMain {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(new int[]{1, 2, 3, 4, 5});

        System.out.println(warehouse);

        for (int i = 0; i < 10; i++) {
            System.out.println(warehouse.next());
        }
    }
}
