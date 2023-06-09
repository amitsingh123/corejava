package com.amit.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class EOWorker {
    private int count =1;
    private int num;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    EOWorker(int num){
        this.num = num;
    }
    public void printEven() throws InterruptedException {
        while(count <= num) {
            lock.lock();
            try {
                if (count % 2 != 0) {
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + ": " + count);
                count++;
                condition.signal();
            } finally {
                lock.unlock();
            }

        }
    }

    public void printOdd() throws InterruptedException {
        while(count < num) {
            lock.lock();
            try {
                if (count % 2 == 0) {
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + " : " + count);
                count++;
                condition.signal();
            } finally {
                lock.unlock();
            }
        }
    }
}
public class EOLock {
    public static void main(String[] args) {
        EOWorker worker = new EOWorker(10);
        Thread t1 = new Thread(()->{
            try{
                worker.printEven();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        },"Even Thread");

        Thread t2 = new Thread(()->{
            try{
                worker.printOdd();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        },"Odd Thread");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }


}
