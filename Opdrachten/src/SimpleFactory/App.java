package SimpleFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class App {
    public static void main(String[] args){
        DHPizzaStore store = new DHPizzaStore();

        Pizza pizza = store.orderPizzaInShop("hawai");

        RdamPizzaStore store2 = new RdamPizzaStore();

        Pizza pizza2 = store2.orderPizzaInShop("pepperoni");
    }
}
