package Iterator;

import java.util.List;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class Ministerie {
    InHolland inHolland;
    HogeschoolRotterdam hr;
    NCOI ncoi;
    public Ministerie(InHolland inHolland, HogeschoolRotterdam hr, NCOI
            ncoi) {
        this.inHolland = inHolland;
        this.hr = hr;
        this.ncoi = ncoi;
    }
    public void printStudenten() {
        Iterator iterator = inHolland.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.voornaam);
        }

        Iterator iterator2 = hr.iterator();
        while(iterator2.hasNext()){
            Student student = iterator2.next();
            System.out.println(student.voornaam);
        }

        Iterator iterator3 = ncoi.iterator();
        while(iterator3.hasNext()){
            Student student = iterator3.next();
            System.out.println(student.voornaam);
        }
    }
}
