package creational.abstractfactory;

public class AdidasFactory implements AbstractFactory {

	public Hat createHat() {
		// TODO Auto-generated method stub
		return new AdidasHat();
	}

	public Pants createPants() {
		// TODO Auto-generated method stub
		return new AdidasPants();
	}

	public Shoes createShoes() {
		// TODO Auto-generated method stub
		return new AdidasShoes();
	}

	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new AdidasShirt();
	}

}
