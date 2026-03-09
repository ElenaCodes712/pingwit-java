package com.pingwit.part9.homework2.task2;

import java.time.LocalDate;

public class PersonDataService {
    private static final int LEGAL_AGE = 18;

    public void PersonCheck(Person person) {

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - person.getBirthYear();

        if (age >= LEGAL_AGE && person.getMaritalStatus() == MaritalStatus.SINGLE) {
            if (person.getGender() == Gender.MALE) {
                System.out.println("Dear " + person.getFirstName() + ", would you like to meet a girl?");
            } else {
                System.out.println("Dear " + person.getFirstName() + ", we will help you to find the man of your dream!");
            }
        }
    }
}
