package SimpleFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class RdamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Adding ingredients to the pizza with a thick pizza base.");
    }
}
