package com.amit.collection.list;

import com.amit.collection.list.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        Car c1 = new Car("Hundai","HUN 21ABCY",2020);
        Car c2 = new Car("MAHINDRA","MAH 12AVCY",1990);
        Car c3 = new Car("TATA","TAT 12AVCY",2021);
        Car c4 = new Car("Honda","HND 22XXYY",2021);


        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        System.out.println("cars...");
        for(Car car : cars){
            System.out.println(car.toString());
        }
        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getBrand().compareTo(car2.getBrand());
            }
        };
        Collections.sort(cars,carComparator);
        print(cars);
        //Using lambda...
        //Comparator<Car> carComparatorLambda = (car1,car2)-> car1.getNumberPlate().compareTo(car2.getNumberPlate());
        //Using comparator comparing
        //Comparator<Car> carComparatorLambda = Comparator.comparing(c->c.getBrand());
        //Using diamond operator
        Comparator<Car> carComparatorLambda = Comparator.comparing(Car::getBrand);
        Collections.sort(cars,carComparatorLambda);
        System.out.println(".....using lambda");
        print(cars);

        //sort the cars based on year of manufactured year
        System.out.println("sort the cars based on year of manufactured year");
        Collections.sort(cars,Comparator.comparing(Car::getYearOfManufacture));
        print(cars);

        //sort the cars based number plates in reverse order
        System.out.println("sort the cars based number plates in reverse order");
        Comparator<Car> carComparatorNoPlate = Comparator.comparing(Car::getNumberPlate);
        Collections.sort(cars,carComparatorNoPlate.reversed());
        print(cars);

    }

    public static void print(List<Car> cars){
        System.out.println("cars. after sort..");
        for(Car car : cars){
            System.out.println(car.toString());
        }
    }
}
