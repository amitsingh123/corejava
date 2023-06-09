package com.amit.thread;

import java.util.ArrayList;
import java.util.List;

public class PCTest {
    List<Integer> numList = new ArrayList<>();
    private static final int MAX_VALUE = 5;
    private static final int MIN_VALUE = 0;
    private int value=0;

    private Object lock = new Object();

    public  void produce() throws InterruptedException
    {
        synchronized (lock){
            while(true){
                if(numList.size() == MAX_VALUE){
                    System.out.println(" Waiting to remove number from list");
                    lock.wait();
                }
                else{
                    System.out.println("adding :"+value);
                    numList.add(value++);
                    //value++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public  void consume() throws InterruptedException
    {
        synchronized (lock){
            while(true){
                if(numList.size() == MIN_VALUE){
                    System.out.println(" Waiting to add number from list");
                    value=0;
                    lock.wait();
                }
                else{
                    System.out.println("remove :"+numList.remove(numList.size()-1));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public static void main(String[] args) {
        PCTest pc = new PCTest();
        Thread t1 = new Thread(()->{
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
