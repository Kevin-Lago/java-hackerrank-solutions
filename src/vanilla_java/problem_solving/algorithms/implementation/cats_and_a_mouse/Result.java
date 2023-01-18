package vanilla_java.problem_solving.algorithms.implementation.cats_and_a_mouse;

public class Result {

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }

    static String catAndMouse(int x, int y, int z) {
        String string = "";

        if (Math.abs(z - y) > Math.abs(z - x)) {
            string = "Cat A";
        } else if (Math.abs(z - y) < Math.abs(z - x)) {
            string = "Cat B";
        } else {
            string = "Mouse C";
        }

        return string;
    }

}
