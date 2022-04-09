package creatures;
import com.company.Human;
import com.company.salleable;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements salleable,Feedable {
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;
    public final String species;
    public String name;
    private Double weight;
    private Boolean alive;
    public List<Animal> animalList = new ArrayList<Animal>();


    public final  FoodType foodType;

    public Animal(String species, String name){
        this.alive = true;
        this.species = species;
        this.name = name;
        if (species.equals("canis")){
            this.foodType = FoodType.ALL;
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("felis")){
            this.foodType = FoodType.MEET;
            this.weight = DEFAULT_CAT_WEIGHT;
        }
        else if (species.equals("cow")){
            this.foodType = FoodType.CROPS;
            this.weight = DEFAULT_CAT_WEIGHT;
        }
        else {
            this.foodType = FoodType.ALL;
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }
    @Override
    public void feed(){
        if (alive.equals(false)){
            System.out.println("nie karmiłeś mnie odpowiednio, umarłem :(");
        }else{
            this.weight += 0.1;
            System.out.println("dzięki za jedzenie");
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
    public void feed(Double foodWeight, FoodType foodType){
        if (alive.equals(false)){
            System.out.println("nie karmiłeś mnie odpowiednio, umarłem :(");
        }else{
            this.weight += foodType.foodBodyRatio * foodWeight;
//            switch (foodType){
//                case ALL:this.weight += FoodType.ALL.foodBodyRatio * foodWeight;break;
//                case MEET:this.weight += FoodType.MEET.foodBodyRatio * foodWeight;break;
//                case CROPS:this.weight += FoodType.CROPS.foodBodyRatio * foodWeight;break;
//
//            }
            this.weight += foodWeight;
            System.out.println("dzięki za jedzenie");
        }
    }

    public void addToAnimalList(Animal animal){
        animalList.add(animal);
    }
}
