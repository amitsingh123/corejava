package com.amit.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonJava8Demo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Jone","Clay",22),
                new Person("Mike","Lobby",32),
                new Person("Ranga","Karnam",35),
                new Person("Madan","Chukki",45));

        //Sort person based on last name
        Collections.sort(persons,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
        printConditionally(persons,p -> true);

        System.out.println("print person with last name start with C");
        printConditionally(persons,p -> p.getLastName().startsWith("C"));

        System.out.println("print person with first name start with J");
        printConditionally(persons,p -> p.getFirstName().startsWith("J"),p -> System.out.println(p));

        System.out.println("print person first name start with M");
        printConditionally(persons,p -> p.getFirstName().startsWith("M"),p -> System.out.println(p.getFirstName()));
    }

//    private static void printConditionally(List<Person> persons, Condition condition) {
//        for(Person p : persons){
//            if(condition.test(p))
//                System.out.println(p);
//        }
//    }

    // Use java predefined functional interface instead of creating own
    private static void printConditionally(List<Person> persons, Predicate<Person> predicate) {
        for (Person person : persons) {
            if (predicate.test(person))
                System.out.println(person);
        }
    }

    private static void printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : persons) {
            if (predicate.test(person))
                consumer.accept(person);
        }
    }
}
