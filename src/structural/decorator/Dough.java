package structural.decorator;

public class Dough implements Pizza {
	private double price = 4.00;
	private String name = "Bottom";



	
	public double getPrice() {
		return price;
	}
	public String getInfo() {
		return name;
	}
}
