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
        print(inHolland);
        print(hr);
        print(ncoi);
    }

    public void print(Iterable school){
        Iterator iterator = school.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.voornaam);
        }
    }
}
