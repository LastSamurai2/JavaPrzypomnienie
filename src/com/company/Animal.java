package com.company;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;
    final String species;
    String name;
    Integer age;
    private Double weight;
    private Boolean alive;

    Animal(String species, String name){
        this.alive = true;
        this.species = species;
        this.name = name;
        if (species.equals("canis")){
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("felis")){
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed(){
        this.weight += 0.1;
        System.out.println("thx for food");
    }
}
