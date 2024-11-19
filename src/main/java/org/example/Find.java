package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Find {
    public void findByName(List<Person> persons) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the search item: ");
        String name = scanner.nextLine();

        List<Person> result = persons.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name)).collect(Collectors.toCollection(ArrayList::new));

        if (result.isEmpty()) {
            System.out.print("Not found.");
        } else {
            System.out.print("Information:");
            result.forEach(System.out::println);
        }
    }

}
