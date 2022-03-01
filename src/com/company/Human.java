package com.company;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Car myCar;

    Human(String firstName, String lastName){
        super("homo sapiens",firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void buyCar(Car myCar){
        this.myCar=myCar;
        System.out.println("mój samochód to"  + myCar.producer + " " + myCar.model);
    }

}
