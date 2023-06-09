package com.amit.java8.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Raju");
        nameList.add("nancy");
        nameList.add("waki");
        nameList.add("Amit");
        nameList.add("Gopi");
        nameList.add("ajit");

        Stream<String> nameStream = nameList.stream();
        nameStream.filter(name->name.startsWith("A")).forEach(System.out::println);

        System.out.println(Stream.iterate(1,n->n+1).limit(5).reduce((a,b)->(a+b)));
    }
}
