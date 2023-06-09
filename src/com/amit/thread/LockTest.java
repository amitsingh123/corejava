package com.amit.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private  int counter = 0;
    private Lock lock = new ReentrantLock();
    private  void increment(){
        lock.lock();
        try{
            for(int i=0;i<1000;i++){
                counter++;
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockTest lt = new LockTest();
        Thread t1 = new Thread(()->{
            lt.increment();
        });
        Thread t2 = new Thread(()->{
            lt.increment();
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("counter value..."+lt.counter);
    }
}
