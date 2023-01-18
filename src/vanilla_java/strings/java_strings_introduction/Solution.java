package vanilla_java.strings.java_strings_introduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        System.out.println(a.length() + b.length());
        System.out.println(b.compareTo(a) >= 0 ? "No" : "Yes");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
    }

}
