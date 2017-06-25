package SimpleFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class App {
    public static void main(String[] args){
        DHPizzaStore store = new DHPizzaStore(new DHPizzaFactory());

        Pizza pizza = store.orderPizzaInShop("hawai");

        RdamPizzaStore store2 = new RdamPizzaStore(new RdamPizzaFactory());

        Pizza pizza2 = store2.orderPizzaInShop("pepperoni");
    }
}
