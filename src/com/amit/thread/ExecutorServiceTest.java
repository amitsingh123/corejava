package com.amit.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->
        {
            System.out.println("Thread..."+ Thread.currentThread().getName());
            for(int i=0;i<10;i++) {
                System.out.println("i.."+(i+1));
            }
        });

        executorService.execute(()->{
            System.out.println("Thread..."+ Thread.currentThread().getName());
            for (int i=11;i<20;i++){
                System.out.println("i.."+(i+1));
            }
        });
        executorService.shutdown();
    }
}
