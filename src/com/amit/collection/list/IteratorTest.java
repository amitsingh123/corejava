package com.amit.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Jio");
        strList.add("savan");
        strList.add("gaana");
        strList.add("Wynk");
        strList.add("Amazon Music");
        strList.add("Spotify");

        Iterator<String> itr = strList.iterator();
        while(itr.hasNext()){
            String str  = itr.next();
            //System.out.println(str);
            if(str.equalsIgnoreCase("wYNK")) itr.remove();
        }
        itr.forEachRemaining(System.out::println);
        //itr.forEachRemaining((str)-> System.out.println(str));
        System.out.println("final list..."+strList);

//        for (String str:strList){
//            if(str.equalsIgnoreCase("gaana"))
//                strList.remove("gaana");
//        }
//
//        System.out.println("final list..."+strList);
    }
}
