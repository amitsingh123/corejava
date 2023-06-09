package com.amit.oops;

public class RefrenceTest {

    public static void stMethod(Student s1){
        Student s2 = new Student(2L,"Anuj");
        s1 = s2;
    }
    public static void main(String[] args) {
        Student s1 = new Student(1L,"Amit");
        stMethod(s1);
        System.out.println("name.."+s1.getName());
    }
}
