package com.amit.collection.list;

import com.amit.collection.list.model.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerComparableTest{
    public static void main(String[] args) {
        Player p1 = new Player(9,"Jacky",34);
        Player p2 = new Player(1,"Thonas",91);
        Player p3 = new Player(2,"Jeo",65);
        Player p4 = new Player(5,"Putin",12);
        Player p5 = new Player(17,"Mike",22);

        List<Player> playerList = new ArrayList<>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);
        System.out.println("before....");
        playerList.stream().forEach(System.out::println);
        //Collections.sort(playerList);
        //System.out.println("after....");
        //playerList.stream().forEach(System.out::println);

        //Using comparator
        // Before Java 8
        Comparator<Player> playerAgeComparator = new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player2.getAge(),player1.getAge());
            }
        };

        Comparator<Player> nameComparator = new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return player2.getName().compareTo(player1.getName());
            }
        };

        System.out.println("Using comparator...");
//        Collections.sort(playerList,playerAgeComparator);
//        playerList.stream().forEach(System.out::println);

//        Collections.sort(playerList,nameComparator);
//        playerList.stream().forEach(System.out::println);

        //Using java 8

        Collections.sort(playerList,Comparator.comparing(Player::getAge));
        playerList.stream().forEach(System.out::println);

    }
}
