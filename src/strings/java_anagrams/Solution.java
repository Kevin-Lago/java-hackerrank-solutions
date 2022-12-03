package strings.java_anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static boolean isAnagram(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.substring(i, i + 1).equalsIgnoreCase(b.substring(j, j + 1))) {
                    a = a.substring(i + 1);
                    b = j == 0 ? b.substring(j + 1) : b.substring(0, j) + b.substring(j + 1);
                    i -= 1;

                    break;
                }
            }
        }

        if (a.equals(b)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
