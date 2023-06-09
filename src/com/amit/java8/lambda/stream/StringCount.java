package com.amit.java8.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("amit","ajit","jocky","tut","","ram","dd","amit");
        strs.stream().filter(s->s != null && !s.isEmpty()).
                collect(Collectors.groupingBy(String::length)).entrySet().forEach(System.out::println);
    }
}
