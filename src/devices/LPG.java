package devices;

public class LPG  extends Car{

    public LPG(Integer yearOfProduction, String producer, String model, String engine, Double value) {
        super(yearOfProduction, producer, model, engine, value);
    }
    @Override
    public void refuel() {
        System.out.println("LPG");
    }
}
