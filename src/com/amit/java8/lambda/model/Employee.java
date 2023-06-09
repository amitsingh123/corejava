package com.amit.java8.lambda.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Employee {
    private Integer empId;
    private String name;
    private Integer age;

    public Employee(Integer empId,String name,Integer age){
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
