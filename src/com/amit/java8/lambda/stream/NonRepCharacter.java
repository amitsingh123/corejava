package com.amit.java8.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepCharacter {
    public static void main(String[] args) {
        String str = "helloworld";
        char[] chars = str.toCharArray();
        List<Integer> nums = Arrays.asList(10,20,30,40);
        nums.stream().filter(n ->(n%3)==0).forEach(System.out::println);
        //List<Character> charList = str.chars().mapToObj(o -> (char)o).collect(Collectors.toList());
        str.chars().mapToObj(o -> (char)o).collect
                (Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(e -> e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
