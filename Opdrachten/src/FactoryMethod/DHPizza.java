package FactoryMethod;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public abstract class DHPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Adding ingredients to the pizza with a thin pizza base.");
    }
}
