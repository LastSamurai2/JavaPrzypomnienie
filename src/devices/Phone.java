package devices;

public class Phone extends Device {
    Double screenSize;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize){
        super (yearOfProduction, producer, model);
        this.screenSize=screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("widze jabłko");
    }

    @Override
    public String toString(){//overriding the toString() method
        return yearOfProduction+" "+producer+" "+model+" "+screenSize;
    }
}

