package com.jprasla.unit2;

import com.jprasla.unit1.Person;
import com.jprasla.unit1.Unit1ExerciseJava7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class FunctionalInterfaceExaple {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort list by last name
        System.out.println("Sorting list by last name");
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printConditionally(people, p -> true, p -> System.out.println(p));

        //Step 3: Create a method that print all people that have last name beginning with C
        System.out.println("Printing all people having last name beginning with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("Printing all people having first name beginning with C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));



    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
        }
    }

}

