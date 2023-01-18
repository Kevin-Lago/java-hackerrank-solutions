package vanilla_java.ten_days_of_statistics;

import java.util.Scanner;

public class StandardDeviation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int sum = 0; int mean = 0;
        long variance = 0; double standardDeviation = 0.0d;

        for (int num : a) {
            sum += num;
        }

        mean = (sum / a.length);

        for (int num : a) {
            variance += Math.pow(num - mean, 2);
        }

        standardDeviation = Math.sqrt(variance / a.length);

        System.out.printf("%.1f %n", standardDeviation);

    }

}
