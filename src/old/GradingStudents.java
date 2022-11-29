import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {

        List<Integer> roundedGrades = new ArrayList<>();
        roundedGrades.add(73);
        roundedGrades.add(67);
        roundedGrades.add(38);
        roundedGrades.add(33);

        grader(roundedGrades);

    }

    public static List<Integer> grader(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            int remainder = (5 - (grade % 5));
            if (grade < 38) {
                roundedGrades.add(grade);
            } else if ((5 - (grade % 5)) < 3) {
                roundedGrades.add(grade + (5 - (grade % 5)));
            } else {
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;

    }

}
