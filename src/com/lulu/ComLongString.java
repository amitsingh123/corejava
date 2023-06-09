package com.lulu;
/*
Given a array of N strings, find the longest common prefix among all strings present in the array.
 Input:
N = 4
arr[] = {lululemonIndia, lulu, lul,
         lululemon}

Output: lul
Explanation: "lul" is the longest common
prefix in all the given strings.
 Input:
N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.
 */
public class ComLongString {
   private static String[] strArr =  {"lululemonIndia", "lulu", "lul",
            "lululemon"};
    public static void main(String[] args) {
        String str = strArr[0];
        StringBuilder res = new StringBuilder();
        char[] cArr = str.toCharArray();
        for(int i=0;i<cArr.length;i++){
            char c = cArr[i];
            for(int j=0;j<strArr.length;j++){
                char[] c1 = strArr[j].toCharArray();
                if(c == c1[i]){
                    res.append(c);
                }
            }
        }
    }
}
