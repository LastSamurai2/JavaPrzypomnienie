package creatures;

public class Pet extends Animal {
    public String petName;
    public String petSpecies;
    public Pet(String petName,String petSpecies){
        super(petSpecies,petName );

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
