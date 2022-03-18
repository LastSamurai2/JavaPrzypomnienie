package com.company;

public class Application {
    public String name;
    public Double version;
    public Double price;

    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    @Override
    public String toString(){//overriding the toString() method
        return name+" "+version+" "+price;
    }

}
