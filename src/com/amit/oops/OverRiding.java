package com.amit.oops;

public class OverRiding {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m1(10);
        b.m1(5,6);
        System.out.println("i=i..."+b.i);

        A a=new B();
        a.m1(8,9);
        System.out.println("i=i..."+a.i);

        B b1 = (B) new A();
        System.out.println("b1..i..."+b1.i);
    }
}
