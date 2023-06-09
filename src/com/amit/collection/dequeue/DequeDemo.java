package com.amit.collection.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Amit");
        deque.add("Ajit");
        deque.add("jhon");
        deque.add("mike");
        for(String name : deque){
            System.out.println(name);
        }

        //remove names from deque
        System.out.println("remove names from deque");
//        while(deque.size()>0){
//            System.out.println(deque.removeLast());
//
//        }

        //stack
        System.out.println("stack....");
        Deque<String> deque1 = new ArrayDeque<>();
        deque1.push("Amit");
        deque1.push("Ajit");
        deque1.push("jhon");
        deque1.push("mike");
        for(String name : deque1){
            System.out.println(name);
        }
        System.out.println("pop from stack");
        while(deque1.size()>0){
            System.out.println(deque1.pop());
        }
    }
}
