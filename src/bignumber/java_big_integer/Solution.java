package bignumber.java_big_integer;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }

}
