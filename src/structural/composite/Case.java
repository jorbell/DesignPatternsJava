package structural.composite;

import java.util.ArrayList;

public class Case implements Part {
    private ArrayList<Part> parts = new ArrayList<Part>();
    private double price = 230;
    
    public double getPrice() {
        double wholePrice = 0;
        for (Part part : parts) {
            wholePrice += part.getPrice();
        }
        return wholePrice + price;
        
    }
    
    public void add(Part part) {
        parts.add(part);
        System.out.println(part.getName() + " added to case");
    }
    
    public void remove(Part part) {
        parts.remove(part);
        System.out.println(part.getName() + " removed from case");
    }

    public String getName() {
        // TODO Auto-generated method stub
        return "Case";

    }
}
