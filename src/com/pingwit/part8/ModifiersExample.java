package com.pingwit.part8;

import com.pingwit.part8.person.ImmutablePerson;
import com.pingwit.part8.person.Person;

public class ModifiersExample {
    public static void main(String[] args) {

        /*
        1. private - class
        2. default - package
        3. protected - package + inheritors
        4. public -
         */

        Person person = new Person();
        person.setName("Egorka");
        person.setAge(28);
        person.setHungry(false);

        Person.sayHi();

        System.out.println(person);

        person.setName("Kolya");
        System.out.println(person);

        ImmutablePerson immutablePerson = new ImmutablePerson("Petr", 33, true);
        System.out.println(immutablePerson);
    }
}
