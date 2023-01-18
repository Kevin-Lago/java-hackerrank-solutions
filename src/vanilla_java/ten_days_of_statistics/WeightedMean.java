package vanilla_java.ten_days_of_statistics;

import java.util.Scanner;

public class WeightedMean {

    public static void main(String[] args) {

        /*
        * Example:
        * Given a list of grades for a student by category: homework, quizes, tests, projects
        * { 78, 89, 98, 100 }
        * Calculate the final grade with the category weights of
        * { 25, 10, 35, 30 }
        *
        * WeightedMean -
        * */

        Scanner scan = new Scanner(System.in);
        float weightedMean = 0.0f;
        float weightedTotal = 0.0f;
        int n = scan.nextInt();
        int[] g = new int[n];
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            g[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            w[i] = scan.nextInt();
            weightedTotal += w[i];
            weightedMean += g[i] * w[i];
        }

        System.out.printf("%.1f %n", weightedMean / weightedTotal);

    }

}
