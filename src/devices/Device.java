package devices;

public abstract class  Device {
    public Integer yearOfProduction;
    protected String producer;
    protected String model;
    public Double value;

    protected Device(Integer yearOfProduction, String producer, String model,Double value){
        this.yearOfProduction=yearOfProduction;
        this.producer = producer;
        this.model = model;
        this.value = value;
    }
    @Override
    public String toString(){//overriding the toString() method
        return yearOfProduction+" "+producer+" "+model;
    }

    abstract  public void turnOn();
}
