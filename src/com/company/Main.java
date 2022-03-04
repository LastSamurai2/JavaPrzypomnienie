package com.company;

import devices.Car;
import devices.Phone;

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
        Car car2 = new Car(2006,"Ford","Mustang","GT500",5000.99);
        Car car3 = new Car(2006,"Ford","Mustang","V8",5000.99);

        System.out.println("Czy auta 1 i 2 są takie same? " + car1.equals(car2));
        System.out.println("Czy auta 2 i 3 są takie same? " + car2.equals(car3));
        if (car1.equals(car2) == true){
            System.out.println(car1 + " " + car2);
        }

        System.out.println("wartość wypłaty " + me.getSalary());
        me.setSalary(417);
        System.out.println("wartość wypłaty " + me.getSalary());
        me.setMyCar(car1);
        System.out.println(me.getMyCar());

        Phone nokia = new Phone(2020,"Nokia","S10",10.00);
        System.out.println(nokia);
        System.out.println(me);
        System.out.println(dog);


        Human murzyn = new Human("Murzyn","Niewolnik");

        me.setPet(murzyn);

        System.out.println(me);
        Human jan = new Human("Jan","Chytry");
        jan.cash = 500.12;

        dog.sell(me,jan,400.00);
        System.out.println(me);
        System.out.println(jan);

        me.setPet(dog);
        dog.sell(me,jan,400.00);
        System.out.println(me);
        System.out.println(jan);


    }
}
