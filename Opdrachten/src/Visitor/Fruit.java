package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class Fruit implements IVisitable {
    int prijs;
    int gewicht;
    String soort;

    @Override
    public void accept(IVisitor visitor) {

    }
}
