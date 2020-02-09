package creational.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pepsi:");
        Factory pepsi = new PepsiFactory();
        pepsi.produceDrink();
        System.out.println("Milk:");
        Factory milk = new MilkFactory();
        milk.produceDrink();
        System.out.println("Water:");
        Factory water = new WaterFactory();
        water.produceDrink();
    }
}
