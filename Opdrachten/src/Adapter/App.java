package Adapter;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class App {
    public static void main(String[] args) {
        PearlOpticalDiscSystem system = new PearlOpticalDiscSystem();
        PearlDisc disc = new DiscAdapter(new DieHardIIIBR());

        system.insert(disc);
        system.write("This is my test!");
        system.play();
        system.eject();
    }
}
