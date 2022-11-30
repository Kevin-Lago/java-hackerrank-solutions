package problem_solving.algorithms.implementation.number_line_jumps;

public class Result {

    public static void main(String[] args) {

        if (kangaroo(0, 3, 4, 2).equals("YES")) {
            System.out.println("Test 0 passed");
        } else {
            System.out.println("Test 0 failed");
        }

        if (kangaroo(0, 2, 5, 3).equals("NO")) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
        }

        if (kangaroo(112, 9563, 8625, 244).equals("NO")) {
            System.out.println("Test 13 passed");
        } else {
            System.out.println("Test 13 failed");
        }

    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        String string = "";

        int a = x1 != 0 ? x1 * v1 : v1;
        int b = x2 != 0 ? x2 * v2 : v2;

        int c = a > b ? a % b : b % a;

        if (x1 > x2 && v1 > v2) {
            string = "NO";
        } else if (x2 > x1 && v2 > v1) {
            string = "NO";
        } else if (c != 0) {
            string = "NO";
        } else {
            string = "YES";
        }

        return string;

    }

}
