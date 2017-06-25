package FactoryMethod;

/**
 * Created by Halil Teker on 6/25/2017.
 */
class RdamPizzaStore {
    RdamPizzaFactory factory;

    public RdamPizzaStore(RdamPizzaFactory factory){
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