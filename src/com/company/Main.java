package com.company;

import creatures.*;
import devices.*;

//import java.awt.List;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("Szarik","Pies");

        System.out.println();
        System.out.println("--------Info o psie------------------");
        System.out.println("pies nazywa sie " + dog.name);
        System.out.println("pies waży " + dog.getWeight());
        System.out.println();
        System.out.println("--------karmienie psa------------------");
        dog.feed();
        dog.feed(5.20, FoodType.ALL);
        System.out.println("pies waży " + dog.getWeight());
        System.out.println();
        System.out.println("--------wyprowadzanie na spacer psa------------------");
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println("pies waży " + dog.getWeight());

        System.out.println();
        System.out.println("--------Informacje o człowieku------------------");
        Human me = new Human("Kacper","Śliwa",5);
        System.out.println(me.getWeight());
        System.out.println(me.species);
        System.out.println(me.name);
        me.getSalary();


        Disel car1 = new Disel(2006,"Ford","Mustang","GT500",5000.99);
        Electric car2 = new Electric(2006,"Ford","Mustang","GT500",5000.99);
        LPG car3 = new LPG(2004,"Ford","Mustang","V8",5000.99);
        LPG car4 = new LPG(1998,"Fiat","124","od kosiarki",100.15);
        System.out.println();
        System.out.println("--------porównanie samochodów------------------");
        System.out.println("Czy auta 1 i 2 są takie same? " + car1.equals(car2));
        System.out.println("Czy auta 2 i 3 są takie same? " + car2.equals(car3));
        if (car1.equals(car2) == true){
            System.out.println(car1 + " " + car2);
        }

        System.out.println();
        System.out.println("--------wypłata------------------");
        me.setSalary(417);
        System.out.println(" wartość wypłaty " + me.getSalary());

        System.out.println();
        System.out.println("--------przypisanie samochodu------------------");
        me.setMyCar(car1,1);
        me.setMyCar(car3,3);
        me.setMyCar(car4,2);
        System.out.println(me.getMyCar(1));

        System.out.println();
        System.out.println("--------przypisanie telefonu------------------");
        Phone nokia = new Phone(2020,"Nokia","S10",10.00,115.00);
        System.out.println(nokia);
        me.setMyPhone(nokia);

        System.out.println();
        System.out.println("--------prób kupienia murzyna------------------");
        Human jan = new Human("Jan","Chytry");
        jan.cash = 500.12;

        Human murzyn = new Human("Murzyn","Niewolnik");

        me.setPet(murzyn);
        System.out.println(me);
        dog.sell(me,jan,400.00);

        System.out.println();
        System.out.println("--------sprzedaż psa------------------");
        me.setPet(dog);
        dog.sell(me,jan,400.00);
        System.out.println(me);
        System.out.println(jan);

        System.out.println();
        System.out.println("--------sprzedaż samochodu------------------");
        me.garageValue();
        me.sortGarage();
        jan.cash= 600.00;
        car1.carOwners.add(jan);
        car1.carOwners.add(me);
        car1.isItExCarOwner(murzyn);
        car1.isItSelerAndBuyer(me,jan);
        car1.sell(me,jan,300.00);
        car1.transactionsNumber();

        System.out.println();
        System.out.println("--------instalacja aplikacji------------------");
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

        System.out.println();
        System.out.println("--------czy app zainstalowana obiekt------------------");
        nokia.isInstaled(app1);

        System.out.println();
        System.out.println("--------czy app zainstalowana nazwa------------------");
        nokia.isInstaled("Uber");

        System.out.println();
        System.out.println("--------wszystkie darmowe apki------------------");
        nokia.allFreeApps();

        System.out.println();
        System.out.println("--------Wartość wszystkich aplikacji------------------");
        nokia.appsValue();

        System.out.println();
        System.out.println("--------sortowanie listy aplikacji------------------");
        nokia.sortedAppsListByName();
        nokia.sortedAppsListByPrice();

        System.out.println();
        System.out.println("--------Sprawdzenie wypłaty------------------");
        //Thread.sleep(5000);
        me.getSalary();

        nokia.operationSystem = Phone.OperationSystem.WINDOWS_MOBILE;

        System.out.println();
        System.out.println("--------info o kraju------------------");
        System.out.println(Country.POLAND.gdpInPLN());
        System.out.println(Country.POLAND.language);
        System.out.println(Country.POLAND.countryCode);

        System.out.println();
        System.out.println("--------mapa krajów------------------");
        Map<String, Country> capitals = new HashMap<>();
        capitals.put("Warsaw",Country.POLAND);
        capitals.put("Washington",Country.USA);
        capitals.put("Berlin",Country.GERMANY);
        System.out.println(capitals.get("Warsaw"));


        TreeMap<String, Country> sortedCountries =new TreeMap<>(capitals);
        System.out.println(sortedCountries);



        Map<String, Double> countries = new HashMap<>();
        countries.put("Poland",10.0);
        countries.put("Germany",20.0);
        countries.put("USA",50.0);
        countries.put("France",30.0);
        countries.put("Finland",15.0);

        Double min = Collections.min(countries.values());
        System.out.println(min);
        Double max = Collections.max(countries.values());
        System.out.println(max);

        Map<Country, Double> countriasAndArea = new HashMap<>();
        countriasAndArea.put(Country.POLAND,10.0);
        countriasAndArea.put(Country.GERMANY,15.0);
        countriasAndArea.put(Country.USA,50.0);

        FarmAnimal cow = new FarmAnimal("cow");
        FarmAnimal sheep = new FarmAnimal("dolly");

        List<Animal> omnivorous = new LinkedList<>();
        omnivorous.add(me);
        omnivorous.add(dog);

        List<Animal> herbivorous = new LinkedList<>();
        herbivorous.add(cow);
        herbivorous.add(sheep);

        Map<FoodType, List<Animal>> animalsByFood = new HashMap<>();
        animalsByFood.put(FoodType.ALL,omnivorous);
        animalsByFood.put(FoodType.CROPS,herbivorous);

        System.out.println(animalsByFood);


        car1.startACar();
        car1.stopACar();


        List<Animal> aminals = new LinkedList<>();
        aminals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
        });

//        aminals.sort(new AnimalsComparator());

        List<Device> devices = new LinkedList<>();
        devices.add(car1);
        devices.add(car3);
        devices.add(nokia);
        System.out.println(devices);
        devices.sort(new Comparator<Device>() {
            @Override
            public int compare(Device o1, Device o2) {
                return o1.yearOfProduction.compareTo(o2.yearOfProduction);
            }
        });
        System.out.println(devices);
    }
}
