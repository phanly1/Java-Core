package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AgeCategory {
    public void ageClassification(List<Person> persons) {
        List<Person> children = persons.stream()
                .filter(person -> person.getAge() <= 18)
                .collect(Collectors.toCollection(ArrayList::new));//dung tocollection(supplier) -> cho phep linh hoat xac dinh kieu collection
        List<Person> adults = persons.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() <= 59)
                .collect(Collectors.toCollection(ArrayList::new));
        List<Person> elderly = persons.stream()
                .filter(person -> person.getAge() >= 60)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Children: ");
        children.forEach(System.out::println);

        System.out.println("\nAdult");
        adults.forEach(System.out::println);

        System.out.println("\nElderly");
        elderly.forEach(System.out::println);

    }
}
