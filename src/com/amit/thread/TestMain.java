package com.amit.thread;

import lombok.SneakyThrows;

class Test implements Runnable{
    public void m1() throws InterruptedException {
        System.out.println("Thread..."+Thread.currentThread().getName()+" entered the m1 method");
        Thread.sleep(1000);
        synchronized(Test.class){
            Thread.sleep(1000);
            System.out.println("Thread ...."+Thread.currentThread().getName()+" acquired the lock..."+Test.class);
            System.out.println("inside m1 method..");
        }
        System.out.println("Thread ...."+Thread.currentThread().getName()+" released the lock..."+Test.class);
    }

    public void run(){
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TestMain{
    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        Thread th1 = new Thread(t1,"Thread 1");
        Thread th2 = new Thread(t1,"Thread 2");
        Thread th3 = new Thread(t2,"Thread 3");
        th1.start();
        th2.start();
        th3.start();
    }
}
