package com.amit.java8.lambda.stream;

import com.amit.java8.lambda.model.MEmployee;
import com.amit.java8.lambda.model.Status;

import java.util.*;
import java.util.stream.Collectors;

public class MaxMinGroupByTest {
    public static void main(String[] args) {
        MEmployee emp1 = new MEmployee(1,"Jhon",1000, Status.ACTIVE,100);
        MEmployee emp2 = new MEmployee(4,"Mike",3000, Status.INACTIVE,200);
        MEmployee emp3 = new MEmployee(5,"Ruby",6000, Status.INACTIVE,300);
        MEmployee emp4 = new MEmployee(3,"Amar",7004, Status.ACTIVE,300);
        MEmployee emp5 = new MEmployee(2,"Elon",6003, Status.ACTIVE,300);
        MEmployee emp6 = new MEmployee(6,"Jeo",1600, Status.INACTIVE,200);

        List<MEmployee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        System.out.println("Before Sorting");
        empList.forEach(System.out::println);
        //Sorting example
        //empList.sort(Comparator.comparing(e->e.getEmpId(), Collections.reverseOrder()));
        //System.out.println("After sorting");
        //empList.forEach(System.out::println);

       // System.out.println("Sorted List with stream");
        //List<MEmployee> sortedEmpList = empList.stream().sorted(Comparator.comparing(e->e.getEmpId(),Collections.reverseOrder())).collect(Collectors.toList());
        //sortedEmpList.forEach(System.out::println);

        Integer maxSalary = empList.stream().max(Comparator.comparing(e->e.getSalary())).get().getSalary();
        System.out.println("max salary.."+maxSalary);

        int minSalary = empList.stream().min(Comparator.comparing(e->e.getSalary())).get().getSalary();
        System.out.println("min salary..."+minSalary);

        System.out.println("Active Employee...");
        List<MEmployee> empActive = empList.stream().filter(e->e.getStatus().equals(Status.ACTIVE)).collect(Collectors.toList());
        empActive.forEach(System.out::println);

        System.out.println("employee details based on department...");
        empList.stream().collect(Collectors.groupingBy(e->e.getDeptId(),Collectors.toList())).
                forEach((k,v)->System.out.println(k+" : "+v));
        System.out.println("employee count based on dept");
        empList.stream().collect(Collectors.groupingBy(e->e.getDeptId(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" : "+v));

    }
}
