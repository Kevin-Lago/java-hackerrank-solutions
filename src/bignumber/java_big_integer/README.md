| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/bignumber/java_bigdecimal)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/data_structures/java_1d_array)</img> |
|:---|:---:|---:|

# Java Big Integer

In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any primitive data types.

Use the power of Java's BigInteger class and solve this problem.

__Input Format__

There will be two lines containing tow numbers, ___a___ and ___b___.

__Constaints__

___a___ and ___b___ are non-negative integers and can have maximum __200__ digits.

__Output Format__

Output two lines. The first line should contain ___a_ + _b___, and the second line should contain ___a_ * _b___. Don't print any leading zeros.

__sample Input 0__

```
1234
20
```

__Sample Output 0__

```
1234
24680
```

__Explanation__

__1234 + 20 = 1254__

__1234 * 20 = 24680__

---

<details><summary>Solution</summary>
    
```java
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
```
</details>
