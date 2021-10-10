package com.amit;

import java.util.*;

public class ConsoleRead {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String t = sc.nextLine();
//        String nm = sc.nextLine();
//        String[] nmArray = nm.split(" ");
//        int n = Integer.valueOf(nmArray[0]);
//        int m = Integer.valueOf(nmArray[1]);
//        System.out.println("n*m = "+n*m);
//        int t1 = Integer.valueOf(sc.nextLine());
//        System.out.println("t "+ t);
//        String nm1 = sc.nextLine();

        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> lst;
        for(int i=0;i<5;i++) {
            if (map.containsKey(i)) {
                lst = map.get(i);
                lst.add(2);
                map.put(1, lst);
            } else {
                lst = new ArrayList<>();
                lst.add(i + 1);
                map.put(i, lst);
            }
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println("key.."+entry.getKey());
            List l1 = (List) entry.getValue();
           // for(Integer in : l1)
            System.out.println("value");
        }

    }
}
