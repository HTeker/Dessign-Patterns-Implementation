package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class Vis implements IVisitable {
    int prijs;
    int gewicht;
    String land;

    public Vis(int prijs, int gewicht, String land){
        this.prijs = prijs;
        this.gewicht = gewicht;
        this.land = land;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
