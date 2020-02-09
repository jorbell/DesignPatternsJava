package creational.factory;

public class WaterFactory extends Factory{
    public Drink createDrink(){
        return new Water();
    };

}
