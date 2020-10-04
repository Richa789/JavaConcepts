package practice.Collections;

import java.util.ArrayList;

public class FourthYearSubjects {

    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Machines");
        subjects.add("Operational Mathematics");
        subjects.add("Power Electronics");
        subjects.add("Thermodynamics");

        for(int i=0; i<subjects.size(); i++) {
            System.out.println(subjects.get(i));

        }
    }
}
