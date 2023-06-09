package com.amit.serialization;

import java.io.Serializable;

public class Address implements Serializable {
    private transient int houseNo;
    private String area;
    private String city;
    private String country;

    Address(){

    }

    public Address(int houseNo,String area,String city,String country){
        this.houseNo = houseNo;
        this.area = area;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
