package vanilla_java.strings.java_string_reverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        for (int i = 0; i < a.length() / 2; i++) {
            if (!a.substring(i, i + 1).equals(a.substring(a.length() - i - 1, a.length() - i))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

}
