package Arrays;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceInAnArray {

    public static void main(String[] args) {

        int[] a = {3, -7, 0};

        System.out.println(minimumAbsoluteDifference(a));

    }

    static int minimumAbsoluteDifference(int[] arr) {

        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            if (abs < min) {
                min = abs;
            }
        }

        return min;

    }

}
