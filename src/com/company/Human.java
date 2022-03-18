package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;


public class Human extends Animal {
    private static final Double DEFAULT_HUMAN_CASH = 0.0;
    private static final int DEFAULT_GARAGE_SIZE = 2;
    public String firstName;
    public String lastName;
    public Car[] garage;
    public Phone myPhone;
    private LocalDateTime lastChecked;
    private Double previousSalaryValue;
    public Animal pet;
    private double salary;
    public Double cash;

    Human(String firstName, String lastName) {
        super("homo sapiens", firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
        this.cash = DEFAULT_HUMAN_CASH;
    }

    Human(String firstName, String lastName, Integer garageSize) {
        super("homo sapiens", firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
        this.cash = DEFAULT_HUMAN_CASH;
    }


    public double getSalary() {
        if(lastChecked != null){
            long diff = ChronoUnit.SECONDS.between(lastChecked, LocalDateTime.now());
            System.out.printf("Twoja wypłata była sprawdzona %d s temu, jej poprzednia wartość to %f", diff, previousSalaryValue);
        }
        lastChecked = LocalDateTime.now();
        previousSalaryValue = salary;
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Odbierz aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US wie o zmianie wypłaty więc nie ma sensu ukrywać dochodu");
        } else {
            System.out.println("Nie można wpisać ujemnej wartości");
        }
    }

    public Car getMyCar(int garageSpace) {
        return this.garage[garageSpace];
    }

    public void setMyCar(Car myCar, int garageSpace) {
        if (salary > myCar.value) {
            garage[garageSpace] = myCar;
        } else if (salary > (myCar.value / 12)) {
            System.out.println("udało się kupić na kredyt");
            garage[garageSpace] = myCar;
        } else {
            System.out.println("znajdź lepszą robote albo idź po podwyżkę biedak jesteś panie");
        }

    }
    public void setMyPhone(Phone phone) {
        myPhone = phone;
        System.out.println("mój telefon "+ myPhone);
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return species + " " + name + " " + garage + " " + salary + " " + pet;
    }

    public double garageValue() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }

        System.out.println("Suma wartości aut w garażu " + sum);
        return sum;
    }

    public void sortGarage() {
        Arrays.sort(garage, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (null == o1) {
                    return null == o2 ? 0 : 1;
                } else if (null == o2) {
                    return -1;
                }
                return o1.yearOfProduction.compareTo(o2.yearOfProduction);
            }
        });
        System.out.println(Arrays.asList(garage));
    }

    public boolean hasACar(Car car) {
        for (Car value : this.garage) {
            if (value == car) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                break;
            }
        }

    }
    public void removeCar(Car car){
        for (int i = 0; i < this.garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                break;
            }
        }
    }

    public boolean isItLastCarOwner(Human seller,Car car) {
        if (seller == car.carOwners.get(car.carOwners.size()-1)) {
            return true;
        }
        return false;
    }


}