import java.util.Arrays;

public class MarcsCakeWalk {

    public static void main(String[] args) {

//        int[] a = {7, 4, 9, 6};
//        marcsCakewalk(a);

        int[] b = {1, 3, 2};
        marcsCakewalk(b);

    }

    static long marcsCakewalk(int[] calorie) {

        Arrays.sort(calorie);
        long total = 0;

        for (int i = calorie.length - 1; i >= 0; i--) {
            total += (long)Math.pow(2, calorie.length - i - 1) * calorie[i];
        }

        return total;

    }

}
