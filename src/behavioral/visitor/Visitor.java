package behavioral.visitor;
interface Visitor {
    public double visit(Liquor liq);
    public double visit(Tobacco tob);
    public double visit(Necessity nec);
    
}
