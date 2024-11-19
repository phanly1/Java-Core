package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public void sortByAge(List<Person> persons) {
        List<Person> sortedPerson = persons.stream().sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge()))
                .collect(Collectors.toCollection(ArrayList::new));
        sortedPerson.forEach(System.out::println);
    }
}
