package vanilla_java.data_structures.java_subarray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Integer[] a = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                Integer[] sa = Arrays.copyOfRange(a, i, j);
                int sum = Arrays.stream(sa).mapToInt(e -> e).sum();

                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
