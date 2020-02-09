package structural.decorator;

public class Pineapple extends Topping {
	private double price = 1.00;
	private String name = "Pineapple";
	
	public Pineapple(Pizza pizza) {
		super(pizza);
		name = "Pineapple";
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
