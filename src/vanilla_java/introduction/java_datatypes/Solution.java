package vanilla_java.introduction.java_datatypes;

import java.util.Scanner;


class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();

                if (x <= -2 * Math.pow(10, 63) && x >= 2 * Math.pow(10, 63) - 1) {
                    System.out.println("n can't be fitted anywhere.");
                } else {
                    System.out.println(x + " can be fitted in:");
                    if (x >= -128 && x <= 127) System.out.println("* byte");
                    if (x >= -32768 && x <= 32767) System.out.println("* short");
                    if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) System.out.println("* int");
                    if (x >= -2 * Math.pow(10, 63) && x <= 2 * Math.pow(10, 63) - 1) System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

}
