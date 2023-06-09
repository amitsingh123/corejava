package com.amit.collection.list;

import com.amit.java8.lambda.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Jacky",56));
        employees.add(new Employee(2,"Dada",22));
        employees.add(new Employee(3,"Jhon",23));
        employees.add(new Employee(4,"Mike",40));
        employees.add(new Employee(5,"Hary",10));

        Iterator<Employee> empItr = employees.iterator();
        while(empItr.hasNext()){
            Employee emp = empItr.next();
            System.out.println(emp);
            if(emp.getAge()==22){
               // emp.setAge(25);
                //employees.add(emp);
            }
            //System.out.println(emp);
        }

        for(Employee emp:employees){
            System.out.println(emp.getName());
            if(emp.getName().equals("Jacky")){
                employees.add(emp);
            }
        }
    }
}
