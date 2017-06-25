package StaticFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
class RdamPizzaStore {
    public Pizza orderPizzaInShop(String pizzaType) {
        Pizza pizza;
        if (pizzaType.equals("hawai")) {
            pizza = new RdamHawaiPizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new RdamPepperoniPizza();
        } else if (pizzaType.equals("cheese")) {
            pizza = new RdamCheesePizza();
        } else {
            throw new RuntimeException("Unknown pizza type");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}