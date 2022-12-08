| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/introduction/java_stdin_and_stdout_ii)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/introduction/java_loops_i)</img> |
|:---|:---:|---:|

# Java Output Formatting

Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get your started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

__Input Format__

Every line of input will contain a String followed by an integer.

Each String will have a maximum of __10__ alphabettic characters, and each integer will be in the inclusive range from __0__ to __999__.

__Output Format__

In each line of output there should be two columns:

The first column contains the String and is left justified using exactly __15__ characters.

The second column contains the integer, expressed in exactly __3__ digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

__Sample Input__

```
java 100
cpp 65
python 50
```

__Sample Output__

```
================================
java           100 
cpp            065 
python         050 
================================
```

__Explanation__

Each String is left-justified with trailing whitespace through the first __15__ characters. The leading digit of the integer is the __16__<sup>th</sup> character, and each integer that was less than __3__ digits now has leading zeroes.

---

<details><summary>Solution</summary>
    
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }

}
```
</details>
