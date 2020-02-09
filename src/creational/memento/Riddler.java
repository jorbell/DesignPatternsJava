package creational.memento;

import java.util.Random;

public class Riddler {

    public Object joinGame() {
        Random r = new Random();
        int number = r.nextInt(10) + 1;

        System.out.println("The number is:" + number);

        return new Memento(number);
    }

    public boolean test(Object o, int guess) {
        Memento memento = (Memento) o;

        if (memento.getNumber() == guess) {
            System.out.println("You gave a correct answer");
            return true;
        }else {
            return false;
        }

    }

}
