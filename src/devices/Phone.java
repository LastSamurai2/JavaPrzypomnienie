package devices;

import com.company.Application;
import com.company.Human;

import java.util.*;
import java.util.stream.Collectors;

public class Phone extends Device {
    private Double screenSize;
    public String appName;
    private static final double VERSION=2.1 ;
    private static final String SERVER_ADDRESS = "/my/serwer/address";
    public String[] appsNames;
    public HashSet<Application> appsList = new HashSet<Application>();

    public enum OperationSystem{
        ANDROID, WINDOWS_MOBILE, IOS;
    }
    public OperationSystem operationSystem;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize, Double value){
        super (yearOfProduction, producer, model, value);
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

    public void installAnnApp(Application app, Human owner){
        if (owner.cash >= app.price){
            appsList.add(app);
            owner.cash -= app.price;
            System.out.println("Zainstalowano");
        }else{
            System.out.println("nie stać cie");
        }

    }
    public void isInstaled(Application app){
        if (appsList.contains(app)){
            System.out.println(app.name + " jest zainstalowana");
        }else {
            System.out.println("ta apka nie jest zainstalowana");
        }

    }

    public void isInstaled(String name ){
        Iterator<Application> it = appsList.iterator();
        while (it.hasNext()) {
            Application object = it.next();
            if(object.name == name){
                System.out.println("aplikacja jest zainstalowana");// find it
            }

        }

    }
    public void allFreeApps(){
        Iterator<Application> it = appsList.iterator();
        while (it.hasNext()) {
            Application object = it.next();
            if(object.price == 0.0){
                System.out.println(object.name);// find it
            }
        }
    }
    public void appsValue(){
        Double sum=0.0;
        Iterator<Application> it = appsList.iterator();
        while (it.hasNext()) {
            Application object = it.next();
            sum += object.price;
        }
        System.out.println("Wartość aplikacji: " + sum);
    }
    public void sortedAppsListByName(){
        List<Application> sortedUsers = appsList.stream()
                .sorted(Comparator.comparing(Application::getName))
                .collect(Collectors.toList());
        System.out.println(sortedUsers);
    }
    public void sortedAppsListByPrice(){
        List<Application> sortedUsers = appsList.stream()
                .sorted(Comparator.comparing(Application::getPrice))
                .collect(Collectors.toList());
        System.out.println(sortedUsers);
    }

}

