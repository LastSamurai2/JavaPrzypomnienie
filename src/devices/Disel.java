package devices;

public class Disel extends Car{
    public Disel(Integer yearOfProduction, String producer, String model, String engine, Double value) {
        super(yearOfProduction, producer, model, engine, value);
    }
    @Override
    public void refuel() {
        System.out.println("Disel");
    }
}
