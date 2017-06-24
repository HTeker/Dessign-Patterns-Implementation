package Iterator;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class InHollandIterator implements Iterator {
    private int index;
    private Student[] studenten;

    public InHollandIterator(Student[] studenten){
        this.studenten = studenten;
    }

    @Override
    public boolean hasNext() {
        return index <= studenten.length - 1;
    }

    @Override
    public Student next() {
        Student s = studenten[index];
        index++;
        return s;
    }
}
