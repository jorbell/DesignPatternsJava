package structural.facade;
public class BankAccountFacade{
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int num, int code){
        accountNumber = num;
        securityCode = code;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }
    public int getAccountNumber() {return accountNumber;};
    public int getSecurityCode() {return securityCode;};
    public void withdrawCash(double cashToGet){
        if(acctChecker.accountActive(getAccountNumber()) 
                && codeChecker.isCodeCorrect(getSecurityCode())
                && fundChecker.haveEnoughMoney(cashToGet)){
            System.out.println("Transaction Complete");
    
        }else{
            System.out.println("Transaction Failed");
        }
    }
    public void depositCash(double cashToDeposit){
        if(acctChecker.accountActive(getAccountNumber()) 
                && codeChecker.isCodeCorrect(getSecurityCode())){
            System.out.println("Transaction Complete");
    
        }else{
            System.out.println("Transaction Failed");
        }
    }
}
