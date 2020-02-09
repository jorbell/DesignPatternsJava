package creational.abstractfactory;

public interface AbstractFactory {
	public abstract Hat createHat();
	public abstract Pants createPants();
	public abstract Shoes createShoes();
	public abstract Shirt createShirt();

}
