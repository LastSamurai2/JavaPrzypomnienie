package creatures;

public interface Feedable {
    void feed();
    void feed(Double foodWeight);



    void feed(Double foodWeight, FoodType foodType);
}
