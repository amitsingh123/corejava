package com.amit.collection.list.model;

public class Car {
    private String brand;
    private String numberPlate;
    private int yearOfManufacture;

    Car(){

    }
    public Car(String brand,String numberPlate,int yearOfManufacture){
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
