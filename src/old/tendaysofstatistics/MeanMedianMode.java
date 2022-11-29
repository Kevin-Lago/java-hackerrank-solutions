package tendaysofstatistics;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianMode {

    public static void main(String[] args) {

        printMeanMedianMode();

    }

    public static void printMeanMedianMode() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        float mean = 0.0f;
        float median = 0.0f;
        int mode = 0;

        while (n > 0) {
            int input = scan.nextInt();
            array[n - 1] = input;
            mean += input;
            n--;
        }

        Arrays.sort(array);
        int previous = array[0];
        mode = array[0];
        int count = 1;
        int maxCount = 1;

        if (array.length % 2 != 0) median = array[array.length / 2];
        else median = ((float) array[array.length / 2] + (float) array[(array.length / 2) - 1]) / 2;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == previous)
                count++;
            else {
                if (count > maxCount) {
                    mode = array[i-1];
                    maxCount = count;
                }
                previous = array[i];
                count = 1;
            }
        }

        System.out.println(mean / array.length); // Mean
        System.out.println(median); // Median
        System.out.println(mode); // Mode
    }

}
