package Adapter;

/**
 * Created by Halil Teker on 6/24/2017.
 */
class PearlOpticalDiscSystem {
    private PearlDisc pearlDisc;
    public void insert(PearlDisc pearlDisc) {
        if (this.pearlDisc != null) {
            eject();
        }
        System.out.println("Inserting disc: " + pearlDisc);
        this.pearlDisc = pearlDisc;
    }
    public PearlDisc eject() {
        System.out.println("Ejecting: " + pearlDisc);
        PearlDisc temporary = pearlDisc;
        pearlDisc = null;
        return temporary;
    }
    public void play() {
        if (pearlDisc != null) {
            System.out.println("Playing: " + pearlDisc.read());
        }
    }
    public void write(String data) {
        if (pearlDisc != null) {
            System.out.println("Burning to disc: " + data);
            pearlDisc.write(data);
        }
    }
}

