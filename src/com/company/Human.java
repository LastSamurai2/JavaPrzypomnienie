package com.company;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Car myCar;
    private double salary;

    Human(String firstName, String lastName){
        super("homo sapiens",firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if ( salary > 0) {
            this.salary = salary;
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Odbierz aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US wie o zmianie wypłaty więc nie ma sensu ukrywać dochodu");
        }else {
            System.out.println("Nie można wpisać ujemnej wartości");
        }
    }

    public Car getMyCar() {
        return this.myCar;
    }

    public void setMyCar(Car myCar) {
        if (salary > myCar.value){
            this.myCar = myCar;
        }else if (salary > (myCar.value/12)){
            System.out.println("udało się kupić na kredyt");
            this.myCar = myCar;
        }else {
            System.out.println("znajdź lepszą robote albo idź po podwyżkę biedak jesteś panie");
        }

    }

}
