package creational.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) { // TODO Auto-generated method stub

                ListConverter strat1 = new Strat1();
                ListConverter strat2 = new Strat2();
                ListConverter strat3 = new Strat3();
                Composition comp = new Composition(strat1);

                List<String> list = new ArrayList<String>();

                for (int i = 0; i < 10; i++){
                    list.add("Texttomanipulate");
                }


                comp.setList(list);
                System.out.println("-------First strategy-------");
                System.out.println(comp.toString());

                System.out.println("-------Second strategy-------");
                comp.setStrat(strat2);
                System.out.println(comp.toString());

                System.out.println("-------Third strategy-------");
                comp.setStrat(strat3);
                System.out.println(comp.toString());
        }

    

}
