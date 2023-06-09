package com.test;

public class Test {
    public static boolean isCheck(){
        try {
            System.out.println("Here - 1");
            return true;
        } finally {
            System.out.println("Here - 2");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean value = Test.isCheck();
        System.out.println("value.."+value);
    }
}
