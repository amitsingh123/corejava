package com.amit.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        printConditionally(persons,p -> p.getFirstName().startsWith("J"));
    }

    private static void printConditionally(List<Person> persons, Condition condition) {
        for(Person p : persons){
            if(condition.test(p))
                System.out.println(p);
        }
    }
}
