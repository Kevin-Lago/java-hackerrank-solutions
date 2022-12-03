package strings.java_substring_comparisons;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String[] subStrings = new String[s.length() - k + 1];

        for (int i = 0; i <= s.length() - k; i++) {
            subStrings[i] = s.substring(i, i + k);
        }

        for (int i = 0; i < subStrings.length; i++) {
            for (int j = i + 1; j < subStrings.length; j++) {
                if (subStrings[i].compareTo(subStrings[j]) > 0) {
                    String temp = subStrings[i];
                    subStrings[i] = subStrings[j];
                    subStrings[j] = temp;
                }
            }
        }

        return subStrings[0] + "\n" + subStrings[subStrings.length - 1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
