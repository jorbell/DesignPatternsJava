
package behavioral.visitor;

import java.text.DecimalFormat;

class TaxHolidayVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");
    public TaxHolidayVisitor(){
        
    }
    public double visit(Liquor liq) {
        // TODO Auto-generated method stub
        System.out.println("Liquor item: price with Tax");
        return Double.parseDouble(df.format((liq.getPrice() * 0.10) + liq.getPrice()));
    }

    public double visit(Tobacco tob) {
        // TODO Auto-generated method stub
        System.out.println("Tobacco item: price with Tax");
        return Double.parseDouble(df.format((tob.getPrice() * 0.12) + tob.getPrice()));
    }

    public double visit(Necessity nec) {
        // TODO Auto-generated method stub
        System.out.println("Neccecity item: price with Tax");
        return Double.parseDouble(df.format((nec.getPrice() * 0) + nec.getPrice()));
    }
    
}
