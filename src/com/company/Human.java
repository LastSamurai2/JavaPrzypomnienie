package com.company;

public class Human extends Animal {
    public String firstName;
    public String lastName;



    Human(String firstName, String lastName){
        super("homo sapiens",firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
