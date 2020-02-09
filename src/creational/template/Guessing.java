package creational.template;

import java.util.Random;
import java.util.Scanner;

class Guessing extends Game{
    /* Implementation of necessary concrete methods */
    Random rnd = new Random();
    Scanner scanner = new Scanner(System.in);
    int answer;
    int guess;
    void initializeGame() {
        answer = rnd.nextInt(14);

    }

    void makePlay(int player) {
        System.out.println("Make a guess");
        guess = scanner.nextInt();
        if (guess == answer){
           System.out.println("You made a correct guess!"); 
        }else {
           System.out.println("Your guess is wrong"); 
        }
    }

    boolean endOfGame() {
        if (guess == answer){
            return true;
        }
        else {
            return false;
        }
    }

    void printWinner() {
        System.out.println("You win the game!");
    }



    /* Specific declarations for the Monopoly game. */

}
