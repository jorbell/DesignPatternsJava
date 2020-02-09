package structural.decorator;

public class Kebab extends Topping {
	private double price = 1.00;
	private String name = "Kebab";
	
	public Kebab(Pizza pizza) {
		super(pizza);
		name = "kebab";
		price = 1.00;
		// TODO Auto-generated constructor stub
	}


        @Override
	public double getPrice() {
		return super.getPrice() + price;
	}
	@Override
	public String getInfo() {
		return super.getInfo() +", "+name;
	}
}
