package structural.composite;

import java.util.ArrayList;

public class MotherBoard implements Part{
	private ArrayList<Part> parts = new ArrayList<Part>();
	
	public double getPrice() {
		double wholePrice = 0;
		for (Part part : parts) {
			wholePrice = wholePrice + part.getPrice();
		}
		return wholePrice + 45;
		
	}
	
	public void add(Part part) {
		parts.add(part);
                System.out.println(part.getName() + " added to motherboard");
	}
	
	public void remove(Part part) {
		parts.remove(part);
                System.out.println(part.getName() + " removed from motherboard");
	}
    public String getName() {
        // TODO Auto-generated method stub
        return "MotherBoard";
    }
}
