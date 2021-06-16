package com.amit.java8.lambda;

import java.util.*;

public class PersonJava7Demo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Jone","Clay",22),
                new Person("Mike","Lobby",32),
                new Person("Ranga","Karnam",35),
                new Person("Madan","Chukki",45));

     //Sort person based on last name
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });
        printAll(persons);
     //print person only if last name start with C
        System.out.println("print person with last name start with C");
        printConditionally(persons, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        //print person only if first name start with J
        System.out.println("print person with first name start with J");
        printConditionally(persons, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("J");
            }
        });
    }

    private static void printConditionally(List<Person> persons, Condition condition) {
        for(Person p : persons){
            if(condition.test(p))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> persons) {
        System.out.println("Print All Persons details");
        for(Person p:persons)
            System.out.println(p);
    }
}
interface Condition {
    boolean test(Person p);
}
