package com.amit.collection.list.model;

public class Player implements Comparable<Player> {
    private Integer id;
    private String name;
    private Integer age;

    public Player(Integer id,String name,Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Player player){
        return Integer.compare(this.id,player.id);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
