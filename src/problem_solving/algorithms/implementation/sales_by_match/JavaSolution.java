package problem_solving.algorithms.implementation.sales_by_match;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class JavaSolution {

    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int count = 0;

//        Arrays.stream(ar).collect(Collectors.groupingBy(e -> e)).forEach(System.out::println);
        Arrays.sort(ar);
        Arrays.stream(ar).forEach(System.out::println);

        for (int i = 0; i < ar.length; i += 2) {
            if (ar[i] == ar[i + 1]) {
                count++;
            }
        }

        return count;

    }

    static int originalAnswer(int n, int[] ar) {
        // StatementCount - 11? 12?
        // SpaceComplexity 0()
        // TimeComplexity

        // 3 +

        int count = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i != j && ar[i] == ar[j]) {
                    if (ar[i] != 0 || ar[j] != 0) {
                        count++;
                        ar[i] = 0;
                        ar[j] = 0;
                    }
                }
            }
        }

        return count;
    }

}
