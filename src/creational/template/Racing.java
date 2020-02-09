package creational.template;

import java.util.Random;

class Racing extends Game{
    /* Implementation of necessary concrete methods */
    Random rnd = new Random();
    int players[] = new int[1000];
    int winner = -1;
    void initializeGame() {
        for (int i = 0;i < playersCount ;i++ ) {
            players[i] = 0;
        }
    }

    void makePlay(int player) {
        players[player] = players[player] + rnd.nextInt(10);
        if (players[player] >= 1000) {
            winner = player;    
        }
    }

    boolean endOfGame() {
        if (winner == -1){
            return false;
        }
        else {
            return true;
        }
    }

    void printWinner() {
        System.out.println("The winner is player number: " + winner);
        System.out.println(players[0]);
    }



    /* Specific declarations for the Monopoly game. */

}
