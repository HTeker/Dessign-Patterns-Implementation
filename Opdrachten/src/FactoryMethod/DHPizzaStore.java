package FactoryMethod;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class DHPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String pizzaType) {
        switch (pizzaType){
            case "hawai":
                return new DHHawaiPizza();
            case "pepperoni":
                return new DHPepperoniPizza();
            case "cheese":
                return new DHCheesePizza();
            default:
                throw new RuntimeException("Unknown pizza type");
        }
    }
}
