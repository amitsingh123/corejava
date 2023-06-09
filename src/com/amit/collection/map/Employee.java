package com.amit.collection.map;

public class Employee {
    private Long id;
    private String name;
    private int age;
    private int salary;

    public Employee(long id,String name,int age,int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int hashCode(){
        return id.hashCode();
    }

    public boolean equals(Object obj){
        Employee emp = (Employee)obj;
        return this.getId().equals(emp.getId());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
