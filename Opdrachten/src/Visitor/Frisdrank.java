package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class Frisdrank implements IVisitable {
    int calorieen;
    double alcoholPercentage;

    public Frisdrank(int calorieen, double alcoholPercentage){
        this.calorieen = calorieen;
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
