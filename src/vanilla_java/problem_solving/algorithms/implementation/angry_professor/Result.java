package vanilla_java.problem_solving.algorithms.implementation.angry_professor;

public class Result {

    public static void main(String[] args) {

        // 3
        // -1 -3 4 2
        int[] i = {-1, -3, 4, 2};

        angryProfessor(3, i);

    }

    static String angryProfessor(int k, int[] a) {

        int count = 0;
        String string = "";

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                count++;
            }
        }

        if (k >= count) {
            string = "NO";
        } else {
            string = "YES";
        }

        return string;

    }

}
