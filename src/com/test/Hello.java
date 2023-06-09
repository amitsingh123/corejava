package com.test;

public class Hello {
    public static void main(String[] args) {
        String str = null;
        Object obj = null;
        if(str !=obj){
            System.out.println("equals");
        }
        else{
            System.out.println("not equal");
        }
    }
}
