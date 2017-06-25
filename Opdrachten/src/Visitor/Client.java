package Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class Client {
    public static void main(String[] args) {
        List<IVisitable> winkelmandje = new LinkedList<IVisitable>();
        winkelmandje.add(new Fruit(2, 200, "Kiwi"));
        winkelmandje.add(new Fruit(1, 400, "Appel"));
        winkelmandje.add(new Vis(5, 250, "Alaska"));
        winkelmandje.add(new Tijdschrift(4, 60));
        winkelmandje.add(new Frisdrank(100, 12.1));
        winkelmandje.add(new Frisdrank(200, 0));
        GreenScoreVisitor groenscoreVisitor = new GreenScoreVisitor();

        for (IVisitable product : winkelmandje) {
            product.accept(groenscoreVisitor);
        }
        System.out.println("De totale groenscore van het winkelmandje is: "
                + groenscoreVisitor.getTotalGreenscore());
    }
}