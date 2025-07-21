package com.pingwit.part9.homework.task2;

import java.time.LocalDate;

public class PersonDataCheck { // PersonDataCheck -> PersonDataCheckService
    public void datingSuggestion(Person person) {

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - person.getBirthYear();
        int legalAge = 18; // это хороший кандидат на константу класса

        if (age >= legalAge && person.getMaritalStatus() == MaritalStatus.SINGLE) {
            if (person.getGender() == Gender.FEMALE) {
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты!");
            } else if (person.getGender() == Gender.MALE) {
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            }
        }
    }
}
