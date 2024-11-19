package org.example;

import java.util.Comparator;
import java.util.List;

public class MinMaxAge {
    public void compareAge(List<Person> persons) {
        Person minAge = persons.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .orElseThrow(() -> new IllegalCallerException(("List is empty")));
        Person maxAge = persons.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElseThrow(() -> new IllegalCallerException("List is empty"));

        System.out.println("Person with minimum age: " + minAge);
        System.out.println("Person with maximum age: " + maxAge);
    }
}
