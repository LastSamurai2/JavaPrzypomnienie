package creatures;

import com.company.Human;
import com.company.salleable;

public abstract class Animal implements salleable,Feedable {
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;
    public final String species;
    public String name;
    Integer age;
    private Double weight;
    private Boolean alive;

    public Animal(String species, String name){
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
    @Override
    public void feed(){
        if (alive.equals(false)){
            System.out.println("you fed me not enough, I'm died :(");
        }else{
            this.weight += 0.1;
            System.out.println("thx for food");
        }
    }

    public void takeForWalk(){
        if ( weight < 0.1 ){
            this.alive = false;
        }
        if (alive.equals(false)){
            System.out.println("you fed me not enough, I'm died :(");
        }else{
            this.weight -= 0.5;
            System.out.println("thx for walk");
        }
    }
    @Override
    public String toString(){//overriding the toString() method
        return species+" "+name+" "+weight+" "+alive;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet.species == "homo sapiens"){
            System.out.println("fajnie mieć murzyna ale już nie można w niewolnictwo");
        }
        else if (seller.pet != null){
            if(buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println(buyer.name + " kupił od " + seller.name + " zwierza " + buyer.pet.name + " za " + price + " zł");
                System.out.println(buyer.name + " ma " + buyer.cash + " " + seller.name + " ma " + seller.cash );
            }else {
                System.out.println("Nie stać Cię");
            }
        }
        else{
            System.out.println("nie masz zwierza, nie sprzedasz");
        }
    }

    @Override
    public void feed(Double foodWeight){
        if (alive.equals(false)){
            System.out.println("you fed me not enough, I'm died :(");
        }else{
            this.weight += foodWeight;
            System.out.println("thx for food");
        }
    }
}
