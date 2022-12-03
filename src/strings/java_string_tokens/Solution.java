package strings.java_string_tokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[\\s!,?._'@]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }

}
