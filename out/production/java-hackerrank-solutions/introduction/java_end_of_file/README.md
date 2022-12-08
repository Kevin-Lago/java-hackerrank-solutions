| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/introduction/java_datatypes)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/introduction/java_static_initializer_block)</img> |
|:---|:---:|---:|

# Java End-of-file

> "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — [Wikipedia: End-of-file](https://en.wikipedia.org/wiki/End-of-file)

This challenge here is to read ___n___ lines of input until you reach EOF, then number and print all ___n___ lines of content.

__Hint:__ Java's Scanner.hasNext() method is helpful for this problem.

__Input Format__

Read some unkown ___n___ lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

__Output Format__

For each line, print the line number, followed by a single space, and then the line content received as input.

__Sample Input__

```
Hello world
I am a file
Read me until end-of-file.
```

__Sample Output__

```
1 Hello world
2 I am a file
3 Read me until end-of-file.
```

---

<details><summary>Solution</summary>
    
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 0;

        while(scanner.hasNext()) {
            line++;
            System.out.println(line + " " + scanner.nextLine());
        }

        scanner.close();
    }

}
```
</details>
