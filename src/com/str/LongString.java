package com.str;

import java.util.HashMap;
import java.util.Map;

public class LongString {

    private static String s = "abcabcbbefgh";

    public static void main(String[] args) {
        Map<Character,Integer> charMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int max=0;
        int l=0,r=0;
        for(int i=0;i<chars.length-1;i++){
            Character c = chars[i];
            if(charMap.containsKey(c)){
                l = charMap.get(c);
                l++;
            }else{
                charMap.put(c,i);
                r++;
            }
            max = Math.max(max,(r-l));
        }
        System.out.println("max count.."+max);
    }

}
