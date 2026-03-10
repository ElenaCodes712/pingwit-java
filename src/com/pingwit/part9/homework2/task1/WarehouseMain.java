package com.pingwit.part9.homework2.task1;

public class WarehouseMain {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5}; // я вынес создание массива в переменную, и теперь смогу изменить содержимое после создания Warehouse, а это плохо. Подумай как этого избежать

        Warehouse warehouse = new Warehouse(numbers);
        numbers[0] = 777; // вот здесь я без проблем изменяю массив
        int currentIndex = 0;

        System.out.println(WarehouseNextNumber.next(warehouse.numbers(), currentIndex));
    }
}
