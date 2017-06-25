package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class Tijdschrift implements IVisitable {
    int prijs;
    int aantalBladzijdes;

    @Override
    public void accept(IVisitor visitor) {

    }
}
