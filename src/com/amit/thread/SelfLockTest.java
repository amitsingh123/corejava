package com.amit.thread;

public class SelfLockTest {

    public static synchronized int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }

    public int sum1(int n){
        if(n==1) return 1;
        return n+sum1(n-1);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           int sum=  sum(5);
            System.out.println("sum.."+sum);
        });
        t1.start();
//        SelfLockTest st = new SelfLockTest();
//        System.out.println(st.sum1(5));
    }
}
