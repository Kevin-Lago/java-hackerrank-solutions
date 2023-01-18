package vanilla_java.advanced.java_sha_256;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(string.getBytes());
        BigInteger number = new BigInteger(1, digest);
        StringBuilder hexString = new StringBuilder(number.toString(16));

        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }

        System.out.println(hexString.toString());
    }

}
