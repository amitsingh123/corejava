package com.amit.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker {
    private static final int MAX_COUNT = 5;
    private static final int MIN_COUNT = 0;
    private List<Integer> list = new ArrayList<>();
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition added = lock.newCondition();
    private Condition removed = lock.newCondition();

    public void produce() throws InterruptedException {
        Thread.sleep(1000);
        while(true){
            lock.lock();
            try{
                while(list.size() == MAX_COUNT) {
                    System.out.println("List is full so wait...");
                    removed.await();
                    Thread.sleep(500);
                }
                    list.add(count);
                System.out.println("produced :"+count);
                    count++;
                    added.signal();
                    Thread.sleep(1000);
            }finally {
                lock.unlock();
            }
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        while(true){
            lock.lock();
            try{
                while(list.size() == MIN_COUNT){
                    System.out.println("List is empty so wait...");
                    count=0;
                    added.await();
                    Thread.sleep(500);
                }
                    System.out.println("consumed :"+list.remove(list.size()-1));
                removed.signal();
                    Thread.sleep(1000);
            } finally {
                lock.unlock();
            }
        }
    }

}
public class PCLockTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(()->{
            try {
                worker.produce();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                worker.consume();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
