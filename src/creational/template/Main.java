package creational.template;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Game racing = new Racing();
        Game guess = new Guessing();
        System.out.println("-------Racing game---------");
        racing.playOneGame(300);
        System.out.println("-------Guessing game---------");
        guess.playOneGame(1);

    }

}
