package SimpleFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class RdamPizzaFactory {
    public Pizza createPizza(String pizzaType) {
        switch (pizzaType){
            case "hawai":
                return new RdamHawaiPizza();
            case "pepperoni":
                return new RdamPepperoniPizza();
            case "cheese":
                return new RdamCheesePizza();
            default:
                throw new RuntimeException("Unknown pizza type");
        }
    }
}
