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
        Student[] inhollandStudenten = inHolland.geefStudentenTerug();
        for (int i = 0; i < inhollandStudenten.length; i++) {
            Student student = inhollandStudenten[i];
            System.out.println(student.voornaam);
        }
        List<Student> hrStudenten = hr.getStudenten();
        for (int i = 0; i < hrStudenten.size(); i++) {
            Student student = hrStudenten.get(i);
            System.out.println(student.voornaam);
        }
        AbstractStudentNode ncoiStudentNode = ncoi.studs();
        while (!ncoiStudentNode.isEmpty) {
            Student student = ncoiStudentNode.student;
            System.out.println(student.voornaam);
            ncoiStudentNode = ncoiStudentNode.tail;
        }
    }
}
