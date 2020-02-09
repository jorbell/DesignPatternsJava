package creational.factory;

public class PepsiFactory extends Factory {

    public Drink createDrink(){
        return new Pepsi();
    };

}
