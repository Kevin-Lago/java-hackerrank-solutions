package vanilla_java.ten_days_of_statistics;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {

    // TODO 2 out of 3 correct
    /*
    * Quartiles are quarter sections of a data set/population
    * find the mean of each quartile
    * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float n = scan.nextInt();
        int[] a = new int[(int)n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        Arrays.sort(a);
        // 3, 5, 7, 8, 12, 13, 14, 18, 21
        // 3, 5, 7, 8, 12, 14, 14, 15, 18, 21
        // 3, 4, 4, 4, 7, 10, 12, 12, 14, 16, 17, 18
        float q = (n / 4);
        float h = (n / 2);

        float q1 = h % 2 == 0 ?
                (a[(int)(q - q % 1) - 1] + a[(int)(q - q % 1)]) / 2 : a[(int)(q)];

        float q2 = n % 2 == 0 ?
                (a[(int)(h - 1)] + a[(int)(h)]) / 2 : a[(int)(h)];

        float q3 = h % 2 == 0 ?
                (a[(int)((q + h) - (q + h) % 1)] + a[(int)((q + h) - ((q + h) % 1)) - 1]) / 2 : a[(int)(q + h)];

        System.out.println((int)q1);
        System.out.println((int)q2);
        System.out.println((int)q3);

    }

}
