package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Create a list of at least 10 people //step 1
        List<Person> People = new ArrayList<>();

        People.add(new Person("Mary", "John", 20));
        People.add(new Person("Bily", "Smith", 15));
        People.add(new Person("Kara", "Davis", 20));
        People.add(new Person("Dave", "Brown", 25));
        People.add(new Person("Ella", "Will", 20));
        People.add(new Person("Frak", "Miller", 18));
        People.add(new Person("Grac", "Taylor", 22));
        People.add(new Person("Heny", "Ander", 20));
        People.add(new Person("Ivy", "Thomas", 23));
        People.add(new Person("Jack", "White", 27));


        // Prompt the user for a name to search // step 2
        List<Person> result = new ArrayList<>();

        while (true) {
            String command = ConsoleHelper.promptForString("Please enter a name to search for, or 'exit' to quit.").toLowerCase();
            if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("quit")) {
                break;
            }
            List<Person> results = new ArrayList<>();
            for (Person p : People) {
                if (p.getFullName().toLowerCase().contains(command)) {
                    results.add(p);
                }
            }
            System.out.println("We found the following people with that name");
            for (Person p : results) {
                System.out.println(p);
            }
        }
        System.out.println("Have a great day!");

        // Step 3 - Calculate average age, oldest, and youngest
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person people : People) {
            int age = people.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = (double) totalAge / People.size();
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

    }
}







