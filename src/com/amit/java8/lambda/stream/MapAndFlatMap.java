package com.amit.java8.lambda.stream;

import com.amit.java8.lambda.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        Student s1 = new Student("Amit",22);
        s1.getCourses().add("Math");
        s1.getCourses().add("English");
        s1.getCourses().add("Java");
        s1.getCourses().add("Spring");
        s1.getMarks().add(50);
        s1.getMarks().add(80);
        s1.getMarks().add(60);
        s1.getMarks().add(90);
        Student s2 = new Student("Ajit",34);
        s2.getCourses().add("Hindi");
        s2.getCourses().add("Bio");
        s2.getCourses().add("Java");
        s2.getCourses().add("Spring");
        s2.getMarks().add(40);
        s2.getMarks().add(30);
        s2.getMarks().add(60);
        s2.getMarks().add(85);
        Student s3 = new Student("Jhon",19);
        s3.getCourses().add("Art");
        s3.getCourses().add("History");
        s3.getCourses().add(".Net");
        s3.getCourses().add("Microservices");
        s3.getMarks().add(50);
        s3.getMarks().add(23);
        s3.getMarks().add(30);
        s3.getMarks().add(21);
        Student s4 = new Student("Mike",23);
        s4.getCourses().add(".Net");
        s4.getCourses().add("Microservices");
        Student s5 = new Student("Harry",37);
        s5.getCourses().add("Cloud");
        s5.getCourses().add("BigData");
        s5.getCourses().add("Python");
        s1.getMarks().add(99);
        s1.getMarks().add(21);
        s1.getMarks().add(11);
        s1.getMarks().add(81);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //students.stream().map(s->s.getName()).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(s->s.getAge(),Collections.reverseOrder())).map(s-> s.getName()).forEach(System.out::println);
        //List<String> courses = students.stream().map(s -> s.getCourses()).collect(Collectors.toList());
        Set<String> courses = students.stream().flatMap(s -> s.getCourses().stream()).collect(Collectors.toSet());
        System.out.println(courses);

    }
}
