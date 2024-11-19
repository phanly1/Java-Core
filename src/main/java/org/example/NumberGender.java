package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberGender {
    public void countNumberGender(List<Person> persons) {
        //dung partition
        Map<Boolean, Long> genderCount = persons.stream()
                .collect(Collectors.partitioningBy(person -> person.getGender() == Boolean.TRUE, Collectors.counting()));

        Long numberFemale = genderCount.get(Boolean.FALSE);
        Long numberMale = genderCount.get(Boolean.TRUE);

        System.out.println("Number of Female : " + numberFemale);
        System.out.println("Number of Male: " + numberMale);

        //dung groupingby
        Map<Boolean, Long> genderCount2 = persons.stream()
                .collect(Collectors.groupingBy(person -> person.getGender() == Boolean.TRUE, Collectors.counting()));

        numberFemale = genderCount2.get(Boolean.FALSE);
        numberMale = genderCount2.get(Boolean.TRUE);

        System.out.println("Number of Female : " + numberFemale);
        System.out.println("Number of Male: " + numberMale);
    }

    public void browseList(List<Person> persons) {
        persons.forEach(person -> System.out.print((person.getGender() ? "Hey boy" : "Hey girl") + "\n"));
    }
}
