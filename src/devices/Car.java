package devices;

public class Car extends Device {
    String engine;
    public Double value;

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


}
