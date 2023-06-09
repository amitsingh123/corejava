package com.amit.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMaxSize {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> copy1 = lst;

        for(int i=0;i<10;i++){
            lst.add(i+1);
        }
        System.out.println("lst..."+lst);
        System.out.println("copy1..."+copy1);
        lst.add(11);

        System.out.println("lst..."+lst);
        System.out.println("copy1..."+copy1);

    }
}
