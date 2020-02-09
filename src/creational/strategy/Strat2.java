package creational.strategy;

import java.util.List;

public class Strat2 implements ListConverter {

    public String listToString(List<String> listOfStrings) {
        String text = "";
        int i = 1;
        for (String s : listOfStrings) {
            if (i%2 == 0) {
                text = text+s+"\n";
            }
            else {
                text = text+s;
            }
            i++;
        }
        return text;

    }

}
