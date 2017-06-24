package Adapter;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class DiscAdapter implements PearlDisc {
    BluRayDisc disc;

    public DiscAdapter(BluRayDisc disc){
        this.disc = disc;
    }

    @Override
    public String read() {
        return disc.getData();
    }

    @Override
    public void write(String data) {
        disc.burn(data);
    }
}
