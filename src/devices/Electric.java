package devices;

public class Electric extends  Car{
    public Electric(Integer yearOfProduction, String producer, String model, String engine, Double value) {
        super(yearOfProduction, producer, model, engine, value);
    }

    @Override
    public void refuel() {
        System.out.println("Electric");
    }
}
