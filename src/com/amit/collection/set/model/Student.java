package com.amit.collection.set.model;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student {
    private long id;
    private String name;
    private int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int hashCode(){
        return 1;
    }

    public boolean equals(Object s){
        Student other = (Student) s;
        return Objects.equals(name, other.name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        Student other = (Student) obj;
//        return Objects.equals(name, other.name);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
