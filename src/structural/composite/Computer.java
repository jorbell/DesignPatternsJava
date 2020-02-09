package structural.composite;

import java.util.ArrayList;

public class Computer {
	ArrayList<Part> parts = new ArrayList<Part>();
	Part computerCase = new Case();
	Part cpu = new CPU();
	Part motherboard = new MotherBoard();
	Part gpu = new GPU();
	Part ram = new RAM();
	Part powersupply = new PowerSupply();
	public void buildComputer() {
		motherboard.add(cpu);
		motherboard.add(ram);
		motherboard.add(gpu);
		
		computerCase.add(motherboard);
		computerCase.remove(motherboard);
		computerCase.add(motherboard);
		computerCase.add(powersupply);
		
		parts.add(computerCase);
	}
	
	public double getPrice() {
		double price = 0;
		for (Part part : parts) {
			price = price + part.getPrice();
		}
		return price;
	}
}
