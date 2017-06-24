package Iterator;

import java.util.List;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class HogeschoolRotterdamIterator implements Iterator {
    private int index;
    private List<Student> studenten;

    public HogeschoolRotterdamIterator(List<Student> studenten){
        this.studenten = studenten;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index <= studenten.size() - 1;
    }

    @Override
    public Student next() {
        Student s = studenten.get(index);
        index++;
        return s;
    }
}
