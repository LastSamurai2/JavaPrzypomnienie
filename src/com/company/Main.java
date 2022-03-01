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

        Car car1 = new Car(2006,"Ford","Mustang","GT500",5000.99);

        System.out.println("wartość wypłaty " + me.getSalary());
        me.setSalary(417);
        System.out.println("wartość wypłaty " + me.getSalary());
        me.setMyCar(car1);
        System.out.println(me.getMyCar());

        Phone nokia = new Phone(2020,"Nokia","S10");



    }
}
