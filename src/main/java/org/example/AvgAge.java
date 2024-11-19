package org.example;

import java.util.List;

public class AvgAge {
    public void calculateAverageAge(List<Person> persons) {
        double avg = persons.stream()
                .mapToInt((Person::getAge))
                .average()
                .orElse(0);
        String formattedAvg = String.format("%.3f", avg);
        System.out.println("Average age: " + formattedAvg);
    }
}
