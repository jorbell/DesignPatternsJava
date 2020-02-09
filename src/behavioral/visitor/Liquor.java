package behavioral.visitor;

class Liquor implements Visitable {
    private double price;
    Liquor(double item){
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
