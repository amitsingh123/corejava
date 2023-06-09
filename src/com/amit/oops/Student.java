package com.amit.oops;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private Long id;
    public Student(Long id,String name){
        this.id = id;
        this.name = name;
    }
}
