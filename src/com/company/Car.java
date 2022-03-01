package com.company;

public class Car extends Device {
    String engine;
    Double value;

    Car(Integer yearOfProduction,String producer,String model,String engine, Double value){
        super(yearOfProduction, producer, model);
        this.engine = engine;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Otwieram drzwi");
        System.out.println("Wkładam kluczyk");
        System.out.println("Przekręcam");
    }
}
