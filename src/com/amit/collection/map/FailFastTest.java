package com.amit.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FailFastTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Amit","Bike");
        map.put("Ajit","Car");
        map.put("Alok","Cycle");
        map.put("amit","Jeep");
        System.out.println(map.toString());
        Set set= map.keySet();
        Iterator its = set.iterator();
        //map.remove("amit");   //Exception in thread "main" java.util.ConcurrentModificationException
        while(its.hasNext()){
            //its.remove();    //Exception in thread "main" java.lang.IllegalStateException
            System.out.println(its.next());
            its.remove();
        }
        System.out.println("final map..."+map.toString()); // final map...{}
    }
}
