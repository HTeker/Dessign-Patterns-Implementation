package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class Tijdschrift implements IVisitable {
    int prijs;
    int aantalBladzijdes;

    public Tijdschrift(int prijs, int aantalBladzijdes){
        this.prijs = prijs;
        this.aantalBladzijdes = aantalBladzijdes;
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
