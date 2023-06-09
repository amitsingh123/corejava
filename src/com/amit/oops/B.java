package com.amit.oops;

public class B extends A {
    int i = 20;
    public void m1(){
        System.out.println("from class B.m1");
    }

    public int m1(int a){
        System.out.println("a.."+a);
        return a;
    }
    public long m1(long a){
        return a;
    }

    public void m1(int a,int b){
        System.out.println("m1 from b..."+"a..."+a+" b:"+b);
    }
}
