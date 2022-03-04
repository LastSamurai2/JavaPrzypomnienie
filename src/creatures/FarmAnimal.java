package creatures;

public class FarmAnimal extends Animal implements Edbile {
    public String farmAnimalName;

    FarmAnimal(String farmAnimalName){
        super("farm animal",farmAnimalName );
        this.farmAnimalName=farmAnimalName;
    }

    @Override
    public void beEaten() {
        System.out.println("zjedzony");
    }
}
