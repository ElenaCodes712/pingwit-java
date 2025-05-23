package com.pingwit.part7.homework.task2;


public class Person {
    String name;
    int age;

    static { //Вопрос, если в task3 в массив добавить еще одного Person, то сколько раз будет выведено сообщение из static блоков на экран? Мы ожидаем 3, но есть подозрение что 3 не будет. Осталось выяснить почему :)
        System.out.println("You created a new instance of the class");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static { // это дубликат static блока выше. статик блоки инициализации и не статик должны располагаться рядом. Конструкторы тоже рядом, без чередований
        System.out.println("You created a new instance of the class");
    }

    public Person() {
        this.name = "Egorka";
        this.age = 25;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
