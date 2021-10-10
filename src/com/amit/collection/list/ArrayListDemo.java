package com.amit.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        String [] flowers = new String[]{"marigold","jasmin","rose","rose"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        System.out.println("list size..."+flowerList.size());
        //flowerList.add("genda fool");
        System.out.println(flowerList.toString());
//        for(String flower: flowerList){
//            System.out.println("flower..."+flower);
//            if(flower.equals("rose")){
//                System.out.println("Hi");
//                flowerList.remove(flower);
//            }
//        }

//        while(flowerList.contains("rose")){
//            flowerList.remove("rose");
//        }

        flowerList.removeIf(flower -> Objects.equals(flower,"rose"));
        System.out.println(flowerList.toString());
    }
}
