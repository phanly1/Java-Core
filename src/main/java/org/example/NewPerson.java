package org.example;

import java.util.List;
import java.util.Scanner;

public class NewPerson {
    public void addNewPerson(List<Person> persons) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name:");
        String name = scanner.nextLine();

        Integer age = null;
        while (age == null) {
            try {
                System.out.print(("Age: "));
                age = scanner.nextInt();
                if (age <= 0 || age >= 120) {
                    System.out.print("Age must be greater than 0 and less than 120.");
                    age = null;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a valid age.");
                scanner.next();
            }
        }

        String genderInput;
        boolean gender = false;
        scanner.nextLine();

        System.out.print("Gender (male/female):");
        genderInput = scanner.nextLine();
        if (genderInput.equalsIgnoreCase("male")) {
            gender = true;
        }
        persons.add(new Person(name, age, gender));
        System.out.println("Person added: " + name + ", Age: " + age + ", Gender: " + (gender ? "Male" : "Female"));
    }

}
