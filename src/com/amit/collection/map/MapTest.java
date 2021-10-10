package com.amit.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 2;
        Map<Integer,Integer> map = new HashMap<>();
        Integer i = map.put(1,num);
        Integer i1 = map.put(1,num2);
        Integer i2 = map.put(2,num);
        System.out.println(map.toString());
        System.out.println("i .."+i);
        System.out.println("i1..."+i1);
        System.out.println("i2..."+i2);

        boolean [] max = new boolean[3];
        System.out.println(max.length);
        for(int j =0;j<max.length;j++){
            System.out.println(max[j]);
        }

    }
}
