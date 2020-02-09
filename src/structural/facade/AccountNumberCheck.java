package structural.facade;
public class AccountNumberCheck{
    private int accountNumber = 123456;
    public int getAccountNunmber() {return accountNumber;}

    public boolean accountActive(int numb){
        if(numb == accountNumber){
            return true;
        }else{
            return false;
        }

    }

}
