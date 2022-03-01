package com.company;

public class Car extends Device {
    String engine;

    Car(Integer yearOfProduction,String producer,String model,String engine){
        super(yearOfProduction, producer, model);
        this.engine = engine;
    }

    @Override
    public void turnOn() {
        System.out.println("Otwieram drzwi");
        System.out.println("Wkładam kluczyk");
        System.out.println("Przekręcam");
    }
}
