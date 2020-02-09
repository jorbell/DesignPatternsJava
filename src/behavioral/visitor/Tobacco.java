package behavioral.visitor;

class Tobacco implements Visitable {
    private double price;
    Tobacco(double item){
        price = item;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        // TODO Auto-generated method stub
        return visitor.visit(this);
    }
}
