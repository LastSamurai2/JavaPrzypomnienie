package com.company;

public abstract class  Device {
    Integer yearOfProduction;
    String producer;
    String model;

    Device(Integer yearOfProduction,String producer,String model){
        this.yearOfProduction=yearOfProduction;
        this.producer = producer;
        this.model = model;
    }

    abstract  public void turnOn();
}
