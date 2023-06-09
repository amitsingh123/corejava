package com.str;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest {
    public static void main(String[] args) {
        String s1 = "amitaa";
        String s2 = "aitma";
        boolean isAnagram = true;
        if(s1.length()!= s2.length()){
            System.out.println(s1 + " and "+ s2 +" not are anagram");
        }else{
            Map<Character,Integer> mChar = new HashMap<>();
            char[] chars1 = s1.toCharArray();
            for(int i=0;i<chars1.length;i++){
                 mChar.put(chars1[i],1);
            }
            char[] chars2 = s2.toCharArray();
            for(int j=0;j<chars2.length;j++){
                if(!mChar.containsKey(chars2[j])){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println(s1 + " and "+ s2 +" are anagram");
            }
            else{
                System.out.println(s1 + " and "+ s2 +" not are anagram");
            }
        }
    }
}




