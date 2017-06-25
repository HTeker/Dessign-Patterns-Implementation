package StaticFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
abstract class Pizza {
    public void prepare() {
        System.out.println("Adding ingredients to the pizza");
    }
    public void bake() {
        System.out.println("Putting pizza in the oven");
    }
    public void cut() {
        System.out.println("Cutting the pizza in peaces");
    }
    public void box() {
        System.out.println("Putting the pizza in a square box");
    }

    public static Pizza create(String pizzaType){
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