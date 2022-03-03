package com.company;

public abstract class  Device {
    protected Integer yearOfProduction;
    protected String producer;
    protected String model;

    protected Device(Integer yearOfProduction, String producer, String model){
        this.yearOfProduction=yearOfProduction;
        this.producer = producer;
        this.model = model;
    }

    abstract  public void turnOn();
}
