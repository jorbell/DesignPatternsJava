package creational.memento;

import java.util.Random;

public class Client {

    private String player;
    private Object o;


    public Client(String player) {
        this.player = player;
    }

    public String getName() {
        return this.player;
    }

    public void startGame(Object o){
        this.o = o;
    }

    public boolean makeAGuess(Riddler riddler) {
        Random r = new Random();
        int number = r.nextInt(10) + 1;
        System.out.println("You guessed: "+number);
        if (riddler.test(o, number)){
            System.out.println(player + " made a right guess");
            return true;
        }else {
            System.out.println(player + " made a wrong guess, guess again");
            return false;
        }
    
    }
}
