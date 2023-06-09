package com.amit.thread.pog;

public class InventoryItem {
    private int item;
    public void increment(){
         item++;
    }
    public void decrement(){
         item--;
    }

    public int getItem(){
        return item;
    }

}
