package com.amit.java8.lambda;

import com.amit.java8.lambda.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Jacky",56));
        employees.add(new Employee(2,"Dada",22));
        employees.add(new Employee(3,"Jhon",23));
        employees.add(new Employee(4,"Mike",40));
        employees.add(new Employee(5,"Hary",10));
        //Collections.singletonList(employees);
        //List.of(employees);
        employees.stream().filter(e->e.getAge()>20).sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
//        employees.sort(Comparator.comparing(Employee::getName));
//        employees.forEach(System.out::println);
//        Iterator<Employee> empItr = employees.iterator();
//        while(empItr.hasNext()){
//            if(empItr.next().getEmpId()==4)
//                empItr.remove();
//        }
//        System.out.println("After....");
//        employees.forEach(System.out::println);
        // collect the age of the employee which is > 22

        List<Integer> ages = employees.stream().filter(e->e.getAge()>22).sorted(Comparator.comparing(Employee::getAge).reversed()).map(e -> e.getAge()).collect(Collectors.toList());
        //ages.sort(Comparator.comparing(Integer::intValue));
        ages.forEach(System.out::println);
//
//        Map<Integer,Employee> eMap = new HashMap<>();
//        eMap.
//        eMap.put(1,new Employee(1,"Jacky",23));
//        eMap.put(2,new Employee(1,"Dorsy",56));
//        eMap.put(3,new Employee(1,"Mike",36));
//        eMap.values().stream().forEach(e-> System.out.println(e.getName()+"|"+e.getAge()));
    }
}
