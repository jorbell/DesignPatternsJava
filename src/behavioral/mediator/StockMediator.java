package behavioral.mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {
    private ArrayList<Collegue> collegues;
    private ArrayList<StockOffer> buyOffers;
    private ArrayList<StockOffer> sellOffers;

    private int collegueCodes;
    public StockMediator(){
        collegues = new ArrayList<Collegue>();
        buyOffers = new ArrayList<StockOffer>();
        sellOffers = new ArrayList<StockOffer>();
    }

    public void saleOffer(String stock, int shares, int collCode) {
        // TODO Auto-generated method stub

        boolean stockSold = false;
        for(StockOffer offer: buyOffers){
            if((offer.getStockSymbol() == stock)&&(offer.getStockShares() == shares)){
                System.out.println(shares + " shares of "+ stock +
                        " sold to colleague code " + offer.getCollegueCode());

                buyOffers.remove(offer);
                stockSold = true;
            }
            if(stockSold){
                break;
            }
        }
        if(!stockSold){
            System.out.println(shares + " share of " + stock + " added to inventory");
            StockOffer newOffer = new StockOffer(shares,stock,collCode);
            sellOffers.add(newOffer);
        }

    }

    public void buyOffer(String stock, int shares, int collCode) {
        // TODO Auto-generated method stub

        boolean stockBought = false;
        for(StockOffer offer: sellOffers){
            if((offer.getStockSymbol() == stock)&&(offer.getStockShares() == shares)){
                System.out.println(shares + " shares of "+ stock +
                        " bought to colleague code " + offer.getCollegueCode());

                sellOffers.remove(offer);
                stockBought = true;
            }
            if(stockBought){
                break;
            }
        }
        if(!stockBought){
            System.out.println(shares + " share of " + stock + " added to inventory");
            StockOffer newOffer = new StockOffer(shares,stock,collCode);
            buyOffers.add(newOffer);
        }
    }

    public void addCollegue(Collegue collegue) {
        // TODO Auto-generated method stub

        collegueCodes++;
        System.out.println(collegueCodes);
        System.out.println(collegueCodes);
        System.out.println(collegueCodes);
        System.out.println(collegueCodes);
        System.out.println(collegueCodes);
        collegue.setCollegueCode(collegueCodes);
        collegues.add(collegue);
    }
    
    public void getStockOffers(){
        System.out.println("Stocks for sale");
        for(StockOffer offer: sellOffers){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
    
        }
        for(StockOffer offer: buyOffers){
            System.out.println("Stock buy offers");
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
    
        }
    }
}
