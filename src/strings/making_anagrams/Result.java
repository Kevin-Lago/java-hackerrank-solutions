package strings.making_anagrams;

import java.util.Arrays;

public class Result {

    public static void main(String[] args) {

        for (;;) {
            System.out.println("yes");
        }

    }

    static int makeAnagram(String a, String b) {

        int n = a.length() < b.length() ? a.length() : b.length();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        int deleted = 0;

        for (int i = 0; i < n; i++) {
            if (ac[i] != bc[i]) {
                deleted++;
            }
        }

        return deleted;

    }

}
