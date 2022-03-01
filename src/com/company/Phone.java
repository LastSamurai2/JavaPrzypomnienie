package com.company;

public class Phone extends Device{
    Double screenSize;

    Phone (Integer yearOfProduction,String producer,String model){
        super (yearOfProduction, producer, model);
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("widze jabłko");
    }
}

