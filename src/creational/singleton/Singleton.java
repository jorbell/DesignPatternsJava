package creational.singleton;

public class Singleton {
    User currentUser;
    private static Singleton INSTANCE = null;
    
    private Singleton(){
        currentUser = new User("Jouko");
    }


    public static Singleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE =  new Singleton();
        }
        return INSTANCE;
    }

}
