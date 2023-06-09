package com.amit.java8.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,3,7,10,7);
        nums.stream().collect(Collectors.groupingBy(num->num,Collectors.counting())).
                entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);

        String str = "abcdayxabbzk";
        char[] chars = str.toCharArray();
        str.chars().mapToObj(obj -> (char)obj).collect(Collectors.toList()).stream().
                collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);

    nums.stream().collect(Collectors.groupingBy(num->num,Collectors.counting())).
           entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(System.out::println);
    }
}
