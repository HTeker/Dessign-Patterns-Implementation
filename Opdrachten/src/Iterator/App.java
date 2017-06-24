package Iterator;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class App {
    public static void main(String[] args) {
        InHolland inHolland = new InHolland();
        HogeschoolRotterdam hr = new HogeschoolRotterdam();
        NCOI ncoi = new NCOI();
        Ministerie ministerie = new Ministerie(inHolland, hr, ncoi);
        ministerie.printStudenten();
    }
}
