package com.str;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstUniqueChar {

    public static void main(String[] args) {
        String s = "leetcode";
        Map<Character,Integer> mChar = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            Character c = chars[i];
            mChar.put(c,mChar.getOrDefault(c,0)+1);
        }

        List<Character> uniqueList =  mChar.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
        System.out.println(uniqueList.get(0));
    }
}
