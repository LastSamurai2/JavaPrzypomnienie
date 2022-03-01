package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis","Szarik");

        System.out.println("pies nazywa sie " + dog.name);
        System.out.println("pies waży " + dog.getWeight());
        dog.feed();
        dog.feed();
        System.out.println("pies waży " + dog.getWeight());
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println("pies waży " + dog.getWeight());
        dog.feed();


        Human me = new Human("Kacper","Śliwa");
        System.out.println(me.getWeight());
        System.out.println(me.species);
        System.out.println(me.name);

        Phone nokia = new Phone();

    }
}
