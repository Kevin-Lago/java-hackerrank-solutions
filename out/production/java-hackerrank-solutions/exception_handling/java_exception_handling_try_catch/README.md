| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Exception Handling (Try-catch)

> Exception handling is the process of responding to the occurrence, during computation, of exceptions - anomalous or exceptional conditions requiring special processing - often changing the normal flow of program execution. [(Wikipedia)](https://en.wikipedia.org/wiki/Exception_handling)

Java has built-in mechanisms to handle exceptions. Using the try statement we can test a block of code for errors.

The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers ___x___ and ___y___ as input, you have to computer ___x / y___. If ___x___ and ___y___ are not __32__ bit signed integers or if ___y___ is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

__Sample Input 0__

```
10
3
```

__Sample Output 0__

```
3
```

__Sample Input 1__

```
10
Hello
```

__Sample Output 1__

```
java.util.InputMismatchException
```

__Sample Input 2__

```
10
0
```

__Sample Output 2__

```
java.lang.ArithmeticException: / by zero
```

__Sample Input 3__

```
23.323
0
```

__Sample Output 3__

```
java.util.InputMismatchException
```

---

<details><summary>Solution</summary>
    
```java
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int x = scan.nextInt();
            int y = scan.nextInt();

            System.out.println(x / y);;
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.util.ArithmeticException: / by zero");
        }
    }

}
```
</details>
