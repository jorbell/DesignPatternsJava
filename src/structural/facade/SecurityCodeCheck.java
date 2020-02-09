package structural.facade;
public class SecurityCodeCheck{
    private int code = 1234;
    public int getCode() {return code;}

    public boolean isCodeCorrect(int numb){
        if(numb == code){
            return true;
        }else{
            return false;
        }

    }

}
