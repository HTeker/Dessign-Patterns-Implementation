package SimpleFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class DHPizzaStore {
    DHPizzaFactory factory;

    public DHPizzaStore(DHPizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizzaInShop(String pizzaType) {
        Pizza pizza = factory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
