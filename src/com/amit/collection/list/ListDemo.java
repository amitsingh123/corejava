package com.amit.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("amit");
        names.add("Ajit");
        names.add("Alok");
        names.add("Amit");
        names.add("amit");
        System.out.println("names..."+names.toString());
        names.remove("Amit");
        System.out.println("names..."+names.toString());
    }
}
