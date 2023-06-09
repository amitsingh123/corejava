package com.amit.java8.lambda.function;

public class FunctionTest {
    private static int num=10;
    public static void main(String[] args) {
       MyFunctionInterface myFun =  (num)->
        {
            if(num%2==0) return true;
            else return false;
        };
        System.out.println(num +" : "+myFun.isEven(num));
    }
    private int m1(int a,int b){
        return 0;
    }
    private void m1(float x,int y){

    }
}
