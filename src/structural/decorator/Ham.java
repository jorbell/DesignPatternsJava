package structural.decorator;

public class Ham extends Topping {
	private double price = 1.50;
	private String name = "ham";
	
	public Ham(Pizza pizza) {
		super(pizza);
		name = "ham";
		price = 1.50;
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
