package com.amit.dp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonTest {
    private static SingletonTest instance = null;
    private SingletonTest(){
    }
    public static SingletonTest getInstance(){
        if(instance == null){
            synchronized(SingletonTest.class){
                if(instance == null){
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<SingletonTest> future1 = es.submit(()->
        {
            System.out.println("Thread name..."+Thread.currentThread().getName());
            return SingletonTest.getInstance();
        });
        Future<SingletonTest> future2 = es.submit(()->
        {
            System.out.println("Thread name..."+Thread.currentThread().getName());
            return SingletonTest.getInstance();
        });
        Future<SingletonTest> future3 = es.submit(()->
        {
            System.out.println("Thread name..."+Thread.currentThread().getName());
            return SingletonTest.getInstance();
        });
        Future<SingletonTest> future4 = es.submit(()->
        {
            System.out.println("Thread name..."+Thread.currentThread().getName());
            return SingletonTest.getInstance();
        });
        Future<SingletonTest> future5 = es.submit(()->
        {
            System.out.println("Thread name..."+Thread.currentThread().getName());
            return SingletonTest.getInstance();
        });
        System.out.println("SingletonTest 1..."+future1.get());
        System.out.println("SingletonTest 2..."+future2.get());
        System.out.println("SingletonTest 3..."+future3.get());
        System.out.println("SingletonTest 4..."+future4.get());
        System.out.println("SingletonTest 5..."+future5.get());
        es.shutdown();
    }
}
