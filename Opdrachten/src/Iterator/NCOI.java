package Iterator;

/**
 * Created by Halil Teker on 6/24/2017.
 */
public class NCOI {
    private StudentNode studentNode;

    public NCOI() {
        this.studentNode = new StudentNode(
                new Student("Jan", "Klaasen", "Rdam"),
                new StudentNode(
                        new Student("Peter", "Dirks", "Utrecht"),
                        new StudentNode(
                                new Student("Erik", "Water", "Leiden"),
                                new Empty()
                        )
                )

        );
    }

    public StudentNode studs() {
        return studentNode;
    }
}
