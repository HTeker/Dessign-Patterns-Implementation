package StaticFactory;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class App {
    public static void main(String[] args){
        RdamPizzaStore store = new RdamPizzaStore();

        Pizza pizza = store.orderPizzaInShop("hawai");
        Pizza pizza2 = store.orderPizzaInShop("pepperoni");
        Pizza pizza3 = store.orderPizzaInShop("cheese");
    }
}
