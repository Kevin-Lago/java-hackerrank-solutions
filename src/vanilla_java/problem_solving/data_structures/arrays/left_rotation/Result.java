package vanilla_java.problem_solving.data_structures.arrays.left_rotation;

public class Result {

    public static void main(String[] args) {

//        int[] a = {1, 2, 3, 4, 5};
//        int d = 4;
//
//        int[] an = {5, 1, 2, 3, 4};
//        if (rotLeft(a, d) == an) {
//            System.out.println("Test case 0 passed");
//        } else {
//            System.out.println("Test case 0 failed");
//        }

        int[] a2 = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int d2 = 13;
        int[] an2 = {};

        if (rotLeft(a2, d2) == an2) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test case 2 failed");
        }

    }

    static int[] rotLeft(int[] a, int d) {

        int[] solution = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i + d < a.length) {
                solution[i] = a[i + d];
            } else {
                solution[i] = a[d - a.length + i];
            }
        }

        return solution;

    }

}
