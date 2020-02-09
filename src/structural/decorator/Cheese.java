package structural.decorator;

public class Cheese extends Topping {
	private double price = 1.00;
	private String name = "Cheese";
	
	public Cheese(Pizza pizza) {
		super(pizza);
		name = "Cheese";
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
