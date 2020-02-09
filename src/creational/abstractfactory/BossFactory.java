package creational.abstractfactory;

public class BossFactory implements AbstractFactory{

	public Hat createHat() {
		// TODO Auto-generated method stub
		return new BossHat();
	}

	public Pants createPants() {
		// TODO Auto-generated method stub
		return new BossPants();
	}

	public Shoes createShoes() {
		// TODO Auto-generated method stub
		return new BossShoes();
	}

	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new BossShirt();
	}
	
}
