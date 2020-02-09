package behavioral.visitor;

class Necessity implements Visitable {
    private double price;
    Necessity(double item){
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
