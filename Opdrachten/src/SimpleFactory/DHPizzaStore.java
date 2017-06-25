package SimpleFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class DHPizzaStore {
    public Pizza orderPizzaInShop(String pizzaType) {
        Pizza pizza;
        if (pizzaType.equals("hawai")) {
            pizza = new DHHawaiPizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new DHPepperoniPizza();
        } else if (pizzaType.equals("cheese")) {
            pizza = new DHCheesePizza();
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
