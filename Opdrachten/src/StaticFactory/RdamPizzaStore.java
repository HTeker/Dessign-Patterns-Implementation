package StaticFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
class RdamPizzaStore {
    public Pizza orderPizzaInShop(String pizzaType) {
        Pizza pizza = Pizza.create(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}