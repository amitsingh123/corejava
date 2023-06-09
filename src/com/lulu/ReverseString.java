package com.lulu;

import java.sql.SQLOutput;

/*
    Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
    Input: S = i.like.this.program.very.much
    Output: much.very.program.this.like.i

    hcum.yrev
    much.very
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String[] strArr = s.split(".");
        System.out.println("str length.."+strArr.length);
        StringBuilder res = new StringBuilder();
        for(int i=strArr.length-1;i>0;i--){
            res.append(strArr[i]+".");
        }
        System.out.println("String.."+s);
        System.out.println("Reversed String.."+res.toString());
    }
}
