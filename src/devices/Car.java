package devices;

import com.company.Human;
import com.company.salleable;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements salleable {
    private String engine;
    public Engine engineClas;
    public List<Human> carOwners = new ArrayList<Human>();
    boolean isRunning;

    public Car(Integer yearOfProduction, String producer, String model, String engine, Double value){
        super(yearOfProduction, producer, model, value);
        this.engine = engine;
        this.engineClas = new Engine();
        this.isRunning = false;

    }

    public class Engine{
        public int horsePower;
        public int volume;
        public int milage;
        public void turnOn(){
            System.out.println("turnOn silnik");
            isRunning = true;
        }
        public void turnOff(){
            System.out.println("turnOff silnik");
            isRunning = false;
        }
    }


    public void startACar(){
        engineClas.turnOn();
    }
    public void stopACar(){
        engineClas.turnOff();
    }


    public void isItExCarOwner(Human seller) {
            if (carOwners.contains(seller)) {
                System.out.println(seller + " był właścieniem tego pojazdu");
            }
            else {
                System.out.println(seller + " nie był właścieniem tego pojazdu");
            }
    }
    public void isItSelerAndBuyer(Human seller, Human buyer) {
        if (carOwners.contains(seller) && carOwners.contains(buyer)) {
            if (carOwners.indexOf(seller) == carOwners.indexOf(buyer)-1 ){
                System.out.println(seller + " spredał auto " + buyer);
            }
            else {
                System.out.println(seller + " nie spredał auta " + buyer);
            }
        }
        else {
            System.out.println("przynajmniej jeden z nich nie posiadał auta");
        }
    }
    public void transactionsNumber(){
        System.out.println("liczba transakcji " + (carOwners.size()-1));
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price){
            throw new Exception("kupujący to biedak");
        }
        if (!seller.hasACar(this)){
            throw new Exception("sprzedający nie ma auta");
        }
        if (!buyer.hasFreeParkingLot()){
            throw new Exception("nie ma miejsca");
        }
        if (!seller.isItLastCarOwner(seller,this)){
            throw new Exception("sprzedający nie jest ostatnim właścicielem");
        }

        buyer.addCar(this);
        seller.removeCar(this);
        buyer.cash -= price;
        seller.cash += price;
        carOwners.add(buyer);

        System.out.println("transakcja zakończona");

        }

    abstract public void refuel();

}
