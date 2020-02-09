package structural.facade;

public class FundsCheck{
    private double cash = 1000.00;
    public void decreaseCash(double money){
        cash -= money;
    }
    public void increaseCash(double money){
        cash += money;
    }
    public boolean haveEnoughMoney(double money){
        if(money > cash){
            System.out.println("Not enough money");
            System.out.println("Current Balance: " + cash);
            return false;
        }else{
            decreaseCash(money);
            System.out.println("Withdrawal complete: Current balance is " + cash);
            return true;
        }
    }
    public void makeDeposit(double money){
        increaseCash(money);
        System.out.println("Deposit complete: Current balance is " + cash);
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }
}
