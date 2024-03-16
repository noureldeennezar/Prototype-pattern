package com.prototype;


public class PrototypeExample {
    public static void main(String[] args) {

        Car prototypeCar = new Car("Toyota", "Camry");

        Map<String, Prototype> carPrototypes = new HashMap<>();

        carPrototypes.put("basic", prototypeCar);

        Car newCar1 = (Car) carPrototypes.get("basic").clone();
        newCar1.setBrand("Honda");

        Car newCar2 = (Car) carPrototypes.get("basic").clone();
        newCar2.setModel("Civic");

        System.out.println("New Car 1: " + newCar1);
        System.out.println("New Car 2: " + newCar2);
    }
}