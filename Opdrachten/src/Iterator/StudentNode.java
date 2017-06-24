package Iterator;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class StudentNode extends AbstractStudentNode {
    public StudentNode(Student student, AbstractStudentNode tail) {
        this.student = student;
        this.tail = tail;
        isEmpty = false;
    }
}

