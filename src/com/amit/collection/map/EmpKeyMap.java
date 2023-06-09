package com.amit.collection.map;

import java.util.HashMap;
import java.util.Map;

public class EmpKeyMap {
    public static void main(String[] args) {
        Map<Employee,String> empMap = new HashMap<>();
        Employee e1 = new Employee(1,"Amit",22,1000);
        System.out.println("e1 hashcode.."+e1.hashCode());
        Employee e2 = new Employee(1,"Amit",22,1000);
        System.out.println("e2 hashcode.."+e2.hashCode());
        Employee e3 = new Employee(3,"Jhon",32,1500);
        System.out.println("is e1 equals to e1.."+e1.equals(e2));
        Employee e4 = new Employee(4,"Rush",21,1500);
        empMap.put(e1,e1.toString());
        empMap.put(e2,e2.toString());
        empMap.put(e3,e3.toString());
        empMap.put(e4,e4.toString());

        System.out.println("map size"+empMap.size());
        System.out.println("values.."+empMap.values());
    }
}
