package creational.memento;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
                Client client = new Client("Batman");
                Client client2 = new Client("Robin");
                Riddler riddler = new Riddler();

                client.startGame(riddler.joinGame());
                client2.startGame(riddler.joinGame());

                while (!client.makeAGuess(riddler)){}
                while (!client2.makeAGuess(riddler)){}


                

    }

}
