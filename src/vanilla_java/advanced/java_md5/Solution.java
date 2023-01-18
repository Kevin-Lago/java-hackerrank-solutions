package vanilla_java.advanced.java_md5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(string.getBytes());
        BigInteger no = new BigInteger(1, messageDigest);
        String hashtext = no.toString(16);

        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }

        System.out.println(hashtext);
    }

}
