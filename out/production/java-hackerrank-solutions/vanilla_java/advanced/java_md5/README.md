| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_lambda_expressions)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_sha_256)</img> |
|:---|:---:|---:|

# Java MD5

MD5 (Message-Digest algorithm 5) is a widely-used cryptography hash function with a __128__-bit has value. Here are some common uses for MD5:

- To store a one-way has of a password.

- To provide some assurance that a transferred file has arrived intact.

MD5 is one in a series of message digest algorithms desgined by Professor Ronald Rivest of MIT (Rivest, __1994__); however. the security to MD5 has been severely compromised, most infamously by the Flame malware in __2012__.

The CMU Software Engineering institute essentially considers MD5 to be ["Cryptographically broken and unsuitable for further use"]().

Given an alphanumeric string, ___s___, denoting a password, compute and print its MD5 encryption value.

__Input Format__

A single alphanumeric string denoting ___s___.

__Constraints__

- $6 \le |s| \le 20$

- String ___s___ consists of English alphabetic letters (i.e., [___a___-___zA___-___Z___]) and/or decimal digits (i.e., [__0-9__]) only.

__Output Format__

Print the MD5 encryption value of ___s___ on a new line.

__Sample Input 0__

```
HelloWorld
```

__Sample Output 0__

```
68e109f0f40ca72a15e05cc22786f8e6
```

__Sample Input 1__

```
Javarmi123
```

__Sample Output 1__

```
2da2d1e0ce7b4951a858ed2d547ef485
```

---

<details><summary>Solution</summary>
    
```java
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();

        // Static getInstance method is called with hashing MD5
        MessageDigest md = MessageDigest.getInstance("MD5");

        // digest() method is called to calculate message digest
        // of an input digest() return array of byte
        byte[] messageDigest = md.digest(string.getBytes());

        // Convert byte array into signum representation
        BigInteger no = new BigInteger(1, messageDigest);

        // Convert message digest into hex value
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }

        System.out.println(hashtext);
    }

}
```
</details>