package Iterator;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class NCOIIterator implements Iterator {
    private StudentNode studentNode;

    public NCOIIterator(StudentNode studentNode){
        this.studentNode = studentNode;
    }

    @Override
    public boolean hasNext() {
        return !studentNode.tail.isEmpty;
    }

    @Override
    public Student next() {
        studentNode = (StudentNode) studentNode.tail;
        return studentNode.student;
    }
}
