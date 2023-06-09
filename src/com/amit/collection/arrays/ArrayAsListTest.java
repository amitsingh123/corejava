package com.amit.collection.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAsListTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        numList.stream().forEach(System.out::println);
    }
}
