| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.introduction/java_stdin_and_stdout_i)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.introduction/java_stdin_and_stdout_ii)</img> |
|:---|:---:|---:|

# Java If-Else

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![If Else Diagram](HackerrankJavaIfElseDiagramDM.png#gh-dark-mode-only)
![If Else Diagram](HackerrankJavaIfElseDiagramLM.png#gh-light-mode-only)

__Task__

Given an integer, ___n___, perform the following conditional actions:

- If ___n___ is odd, print ```Weird```

- If ___n___ is even and in the inclusive range of __2__ to __5__, print ```Not Weird```

- If ___n___ is even and in the inclusive range of __6__ to __20__, print ```Weird```

- If ___n___ is even and greater than __20__, print ```Not Weird```

Complete the stub code provided in your editor to print whether of not ___n___ is weird.

__Input Format__

A single line containing a positive integer, ___n___.

__Constraints__

- __1 <= _n_ <= 100__

__Output Format__

Print ```Weird``` if the number is weird; otherwise, print ```Not Weird```.

__Sample Input 0__

```
3
```

__Sample Output 0__

```
Weird
```

__Sample Input 1__

```
24
```

__Sample Output 1__

```
Not Weird
```

__Explanation__

Sample Case 0: ___n_ = 3__

___n___ is odd and odd numbers are weird, so we print ```Weird```.

Sample Case 1: ___n_ = 24__

___n_ > 20__ and ___n___ is even, so it isn't weird. Thus, we print ```Not Weird```.

---

<details><summary>Solution</summary>
    
```java
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }

}
```
</details>
