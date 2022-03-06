package devices;

import com.company.Human;
import com.company.salleable;

public abstract class Car extends Device implements salleable {
    String engine;


    public Car(Integer yearOfProduction, String producer, String model, String engine, Double value){
        super(yearOfProduction, producer, model);
        this.engine = engine;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Otwieram drzwi");
        System.out.println("Wkładam kluczyk");
        System.out.println("Przekręcam");
    }

    @Override
    public boolean equals(Object obj) {
        Car car2 = (Car) obj;
        return this.yearOfProduction.equals(car2.yearOfProduction) &&
                this.producer.equals(car2.producer) &&
                this.model.equals(car2.model) &&
                this.engine.equals(car2.engine) &&
                this.value.equals(car2.value);

    }

    @Override
    public String toString(){//overriding the toString() method
        return yearOfProduction+" "+producer+" "+model+" "+engine+" "+value;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
//        public void sell(Human seller, Human buyer, Double price,int garageSpace)
        Integer[] freeSpaces;
        for (int i=0; i<buyer.garage.length;i++){
            if (buyer.garage[i] != null){
                Car car= buyer.garage[i];

            }
        }
        /*System.out.println("Suma wartości aut w garażu " + sum);
        if (seller.garage[garageSpace] != null){
            if(buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.myCar = seller.myCar;
                seller.myCar = null;
                System.out.println(buyer.name + " kupił od " + seller.name + " auto " + buyer.myCar + " za " + price + " zł");
                System.out.println(buyer.name + " ma " + buyer.cash + " " + seller.name + " ma " + seller.cash );
            }else {
                System.out.println("Nie stać Cię");
            }
        }
        else{
            System.out.println("nie masz zwierza, nie sprzedasz");
        }*/
    }

    abstract public void refuel();

}
