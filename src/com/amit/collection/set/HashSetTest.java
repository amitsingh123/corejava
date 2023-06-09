package com.amit.collection.set;

import com.amit.collection.set.model.Student;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Amit",23);
        Student s2 = new Student(2,"Jhon",12);
        Student s3 = new Student(3,"Mike",32);
        Student s4 = new Student(4,"Mike",32);
        System.out.println(s3.equals(s4));

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);

        for(Student student:studentSet){
            System.out.println(student);
            System.out.println("hashcode..."+student.hashCode());
        }
    }
}
