| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/bignumber/java_primality_test)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/bignumber/java_biginteger)</img> |
|:---|:---:|---:|

# Java Big Decimal

Java's BigDecimal class can handle arbitrart-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, ___s___, of ___n___ real number strings, sort them in descending order - but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that __.1__ is printed as __.1__, and __0.1__ is printed as __0.1__. If two numbers represent numerically equivalent values (e.g., __.1__ = __0.1__), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array ___s___'s elements according to the instructions above.

__Input Format__

The first line consists of a single integer, ___n___, denoting the number of integer strings.

Each line ___i___ of the ___n___ subsequent lines contains a real number denoting the values of ___s<sub>i</sub>___.

__Constraints__

- __1 <= _n_ <= 200__

- Each ___s<sub>i</sub>___ has atr most __300__ digits.

__Output Format__

Locked stub code in the editor will print the contents of array ___s___ to stdout. You are only responsible for reordering teh array's elements.

__Sample Input__

```
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
```

__Sample Output__

```
90
56.6
50
02.34
0.12
.12
0
000.000
-100
```

---

<details><summary>Solution</summary>
    
```java
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, 0, n, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
```
</details>
