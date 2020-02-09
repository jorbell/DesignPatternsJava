package behavioral.mediator;
class StockOffer{
    private int stockShares;
    private String stockSymbol;
    private int collegueCode;

    public StockOffer(int shares, String stock, int code){
    
        stockShares = shares;
        stockSymbol = stock;
        collegueCode = code;
    }

    /**
     * @return the stockShares
     */
    public int getStockShares() {
        return stockShares;
    }

    /**
     * @return the stockSymbol
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * @return the collegueCode
     */
    public int getCollegueCode() {
        return collegueCode;
    }
}
