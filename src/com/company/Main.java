package com.company;

import creatures.Animal;
import creatures.Pet;
import devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("Szarik","Pies");

        System.out.println("pies nazywa sie " + dog.name);
        System.out.println("pies waży " + dog.getWeight());
        dog.feed();
        dog.feed(5.20);
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




        Human me = new Human("Kacper","Śliwa",5);
        System.out.println(me.getWeight());
        System.out.println(me.species);
        System.out.println(me.name);

        Disel car1 = new Disel(2006,"Ford","Mustang","GT500",5000.99);
        Electric car2 = new Electric(2006,"Ford","Mustang","GT500",5000.99);
        LPG car3 = new LPG(2004,"Ford","Mustang","V8",5000.99);
        LPG car4 = new LPG(1998,"Fiat","124","od kosiarki",100.15);

        System.out.println("Czy auta 1 i 2 są takie same? " + car1.equals(car2));
        System.out.println("Czy auta 2 i 3 są takie same? " + car2.equals(car3));
        if (car1.equals(car2) == true){
            System.out.println(car1 + " " + car2);
        }

        System.out.println("wartość wypłaty " + me.getSalary());
        me.setSalary(417);
        System.out.println("wartość wypłaty " + me.getSalary());
        me.setMyCar(car1,1);
        me.setMyCar(car3,3);
        me.setMyCar(car4,2);
        System.out.println(me.getMyCar(1));

        Phone nokia = new Phone(2020,"Nokia","S10",10.00,115.00);
        System.out.println(nokia);
        System.out.println(me);
        System.out.println(dog);
        me.setMyPhone(nokia);

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
        me.garageValue();
        me.sortGarage();

        jan.cash= 600.00;

        car1.carOwners.add(jan);
        car1.carOwners.add(me);
        car1.isItExCarOwner(murzyn);
        car1.isItSelerAndBuyer(me,jan);
        car1.sell(me,jan,300.00);
        car1.transactionsNumber();

        Application app1 = new Application("Uber",1.1,0.0);
        Application app2 = new Application("PysznePl",1.1,15.0);
        Application app3 = new Application("Tinder",1.1,0.0);
        Application app4 = new Application("Spotify",1.1,29.99);
        Application app5 = new Application("Finebite",1.1,13.15);

        nokia.installAnnApp(app1,me);
        nokia.installAnnApp(app2,me);
        nokia.installAnnApp(app3,me);
        nokia.installAnnApp(app4,me);
        nokia.installAnnApp(app5,me);
        nokia.isInstaled(app1);
        nokia.isInstaled("Uber");
        nokia.allFreeApps();
        nokia.appsValue();
        nokia.sortedAppsListByName();
        nokia.sortedAppsListByPrice();

    }
}
