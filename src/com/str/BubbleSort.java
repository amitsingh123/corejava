package com.str;

public class BubbleSort {
    private static int[] nums = {30,50,20,10,40};
     // 10,50,30,20,40
     // 10,20,50,30,40
    //10,20,
    // amit // tiam
    public static void bubbleSort() {
        for (int i = 0; i < nums.length - 1; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                if (num2 < num1) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("before sorting");
        for(int i=0;i<nums.length;i++){
            System.out.print (nums[i]+" ");
        }
        System.out.println();
        System.out.println("after sorting..");
        bubbleSort();
        for(int i=0;i<nums.length;i++){
            System.out.print (nums[i]+" ");
        }
    }
}
