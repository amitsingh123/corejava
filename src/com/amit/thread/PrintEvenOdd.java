package com.amit.thread;

public class PrintEvenOdd {

    public static void main(String[] args) {
        Printer p = new Printer(10);
        Thread t1 = new Thread(()->{ p.printEven();},"Even Thread");
        Thread t2 = new Thread(()->{p.printOdd();},"Odd Thread");
        t1.start();
        t2.start();
    }
}
