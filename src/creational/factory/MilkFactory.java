package creational.factory;

public class MilkFactory extends Factory{
    public Drink createDrink(){
        return new Milk();
    };

}
