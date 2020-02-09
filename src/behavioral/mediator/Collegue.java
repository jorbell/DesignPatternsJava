package behavioral.mediator;
public abstract class Collegue{
    private Mediator mediator;
    private int collegueCode;
    public Collegue(Mediator med){
        mediator = med;
    }
    public void saleOffer(String stock, int shares){
        mediator.saleOffer(stock, shares, this.collegueCode);
    }
    public void buyOffer(String stock, int shares){
        mediator.buyOffer(stock, shares, this.collegueCode);
    }

    /**
     * @param collegueCode the collegueCode to set
     */
    public void setCollegueCode(int collegueCode) {
        this.collegueCode = collegueCode;
    }
}
