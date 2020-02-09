package behavioral.mediator;
public interface Mediator {
    public void saleOffer(String stock, int shares, int collCode);
    public void buyOffer(String stock, int shares, int collCode);
    public void addCollegue(Collegue collegue);
    
}
