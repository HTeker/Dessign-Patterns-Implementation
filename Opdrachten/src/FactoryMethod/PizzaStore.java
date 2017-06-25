package FactoryMethod;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public abstract class PizzaStore {
    public Pizza orderPizzaInShop(String pizzaType) {
        Pizza pizza;

        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);
}
