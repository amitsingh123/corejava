package com.str;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public static void main(String[] args) {
       int[] numbers = {2, 9, 22,8};
       int target=11;

        Map<Integer,Integer> targetMap = new HashMap<>();
        int[] res= new int[2];
        for(int i=0;i<numbers.length;i++){
            int tnum = target-numbers[i];
            if(targetMap.containsKey(tnum)){
                res[0] = targetMap.get(tnum);
                res[1] = i;
            }
            else{
                targetMap.put(numbers[i],i);
            }
        }
        if(res.length==0){
            res[0]=-1;
            res[1]=-1;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
