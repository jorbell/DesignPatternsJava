package creational.strategy;

import java.util.List;

public class Strat1 implements ListConverter {

    public String listToString(List<String> listOfStrings) {

        String text = "";

        for (String s : listOfStrings) {
                text = text + s + "\n";
            }
    return text;
    }
}
