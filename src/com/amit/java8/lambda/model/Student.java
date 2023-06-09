package com.amit.java8.lambda.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private List<String> courses;
    private List<Integer> marks;

    public Student(String name,Integer age){
        this.name = name;
        this.age = age;
        courses = new ArrayList<>();
        marks = new ArrayList<>();
    }

    public List<String> getCourses(){
        return courses;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Integer> getMarks(){
        return marks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
