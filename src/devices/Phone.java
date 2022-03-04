package devices;

public class Phone extends Device {
    Double screenSize;
    public String appName;
    private static final double VERSION=2.1 ;
    private static final String SERVER_ADDRESS = "/my/serwer/address";
    public String[] appsNames;

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

    public void installAnnApp(String appName){
        System.out.println(appName);
    }
    public void installAnnApp(String appName, double VERSION){
        System.out.println(appName + " " + VERSION);
    }
    public void installAnnApp(String appName, double VERSION, String SERVER_ADDRESS){
        System.out.println(appName + " " + VERSION + " " + SERVER_ADDRESS);
    }
    public void installAnnApp(String[] appsNames){
        System.out.println(appsNames);
    }

}

