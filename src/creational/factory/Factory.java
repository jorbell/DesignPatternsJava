package creational.factory;

public abstract class Factory {

    Drink drink = null;
    public abstract Drink createDrink();
    public void produceDrink(){
        if (drink == null)
            drink = createDrink();
        System.out.println("The factory produces " + drink);
    }
}
