package com.amit.thread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("thread wil sleep now");
        Thread.sleep(10000);
        System.out.println("thread woke up now");
    }
}
