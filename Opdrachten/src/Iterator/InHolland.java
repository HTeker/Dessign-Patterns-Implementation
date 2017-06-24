package Iterator;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class InHolland implements Iterable {
    private Student[] studenten;
    public InHolland() {
        // TODO Maak de studenten array, en voeg enkele studenten toe
        studenten = new Student[]{
                new Student("Halil", "Teker", "Den Haag"),
                new Student("Anoop", "Bhaltair", "Den Haag"),
                new Student("Anil", "Heard", "Den Haag")
        };
    }
    public Student[] geefStudentenTerug() {
        return this.studenten;
    }

    @Override
    public Iterator iterator() {
        return new InHollandIterator(this.studenten);
    }
}