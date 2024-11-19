package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Nguyễn Văn A", 12, true));
        persons.add(new Person("Trần Thị B", 30, false));
        persons.add(new Person("Lê Văn C", 14, true));
        persons.add(new Person("Phạm Thị D", 27, false));
        persons.add(new Person("Hoàng Văn E", 35, true));
        persons.add(new Person("Vũ Thị F", 60, false));
        persons.add(new Person("Đỗ Văn G", 40, true));
        persons.add(new Person("Ngô Thị H", 76, false));
        persons.add(new Person("Bùi Văn I", 19, true));
        persons.add(new Person("Mai Thị J", 77, false));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Age Classification");
            System.out.println("2. Calculate Average Age");
            System.out.println("3. Compare Age");
            System.out.println("4. Count number gender");
            System.out.println("5. Add new person");
            System.out.println("6. Sort by Age");
            System.out.println("7. Find by name");
            System.out.println("8. Say hello");
            System.out.println("9. Exit");
            System.out.print("Please enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->  new AgeCategory().ageClassification(persons);
                case 2 -> new AvgAge().calculateAverageAge(persons);
                case 3 -> new MinMaxAge().compareAge(persons);
                case 4 -> new NumberGender().countNumberGender(persons);
                case 5 -> new NewPerson().addNewPerson(persons);
                case 6 -> new Sort().sortByAge(persons);
                case 7 -> new Find().findByName(persons);
                case 8 -> new NumberGender().browseList(persons);
                case 9 -> {}
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

    }

}