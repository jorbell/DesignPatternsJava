package structural.decorator;

public class Pepper extends Topping {
	private double price = 1.00;
	private String name = "Pepper";
	
	public Pepper(Pizza pizza) {
		super(pizza);
		name = "Pepper";
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
