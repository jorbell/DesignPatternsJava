package behavioral.interpreter;

public class Tablespoons extends Expression {

    @Override
    public String gallons(double quantity) {
        // TODO Auto-generated method stub
        return Double.toString(quantity/256);
    }

    @Override
    public String quarts(double quantity) {
        // TODO Auto-generated method stub
        return Double.toString(quantity/64);
    }

    @Override
    public String pints(double quantity) {
        // TODO Auto-generated method stub
        return Double.toString(quantity/32);
    }

    @Override
    public String cups(double quantity) {
        // TODO Auto-generated method stub
        return Double.toString(quantity/16);
    }

    @Override
    public String tablespoons(double quantity) {
        // TODO Auto-generated method stub
        return Double.toString(quantity);
    }
    
}
