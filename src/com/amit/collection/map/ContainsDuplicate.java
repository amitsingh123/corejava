package com.amit.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Ajit");
        names.add("Jhon");
        names.add("amit");
        names.add("Amit");
        names.add("Mike");

        Map<String,Integer> namesMap = new HashMap<>();
//        for(String str: names){
//            namesMap.put(str,namesMap.getOrDefault(str,0)+1);
//        }

        names.forEach(str -> namesMap.put(str,namesMap.getOrDefault(str,0)+1));

        for (Map.Entry<String,Integer> entry: namesMap.entrySet()){
            System.out.println("name.."+entry.getKey()+" count..."+entry.getValue());
        }
    }
}
