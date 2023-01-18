package vanilla_java.introduction.java_static_initializer_block;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int h = scan.nextInt();

        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
    }

}
