package creational.strategy;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    private List<String> listOfStrings;
    private ListConverter strat;
    
    public Composition(ListConverter strat) {
        this.strat = strat;
        listOfStrings = new ArrayList<String>();
    }

    public void setList(List<String> list) {
        this.listOfStrings = list;
    }

    public void setStrat(ListConverter strat) {
        this.strat = strat;
    }

    public void addToList(String s){
        listOfStrings.add(s);
    }

    public String toString() {
        return strat.listToString(listOfStrings);
    }


}
