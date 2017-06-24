package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class HogeschoolRotterdam {
    private List<Student> studenten;
    public HogeschoolRotterdam() {
        // TODO Maak de studenten list, en voeg enkele studenten toe
        studenten = new ArrayList<Student>();
        studenten.add(new Student("Jan", "Janssen", "Rotterdam"));
        studenten.add(new Student("Chukwuemeka", "Aziz", "Rotterdam"));
        studenten.add(new Student("Ravindra", "Dushyant", "Rotterdam"));
    }
    public List<Student> getStudenten() {
        return this.studenten;
    }
}
