package data_structures.java_subarray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                Integer[] sa = Arrays.copyOfRange(a, i, j);
            }
        }

        System.out.println(a);
    }

}
