package com.amit.thread;

public class Printer{
    int counter = 1;
    int n;
    public Printer(int n){
        this.n = n;
    }

    public Printer(){};

    public void printEven(){
        synchronized (this){
        while(n>counter) {
            if (counter % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
            notifyAll();
        }
        }
    }
    public void printOdd(){
        synchronized (this){
        while(n>counter) {
            if (counter % 2 != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
            notifyAll();
        }
        }
    }

}
