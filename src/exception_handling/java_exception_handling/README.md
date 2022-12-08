| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/exception_handling/java_exception_handling_try_catch)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/advanced/java_varargs_simple_addition)</img> |
|:---|:---:|---:|

# Java Exception Handling

You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method ```long power(int, int)```. This method takes two integers, ___n___ and ___p___, as parameters and finds ___n<sup>p</sup>___. If either ___n___ or ___p___ is negative, then the method must throw an exception which says "__n or p should not be negative__.". Also, if both ___n___ and ___p___ are zero, then the method must throw an exception which says "__n and p should not be zero__.".

For example, -4 and -5 would result in __java.lang.Exception: n or p should not be negative__.

Complete the function ```power``` in the class MyCalculator and return the appropriate result after the power operation, or an appropriate exception as details above.

__Input Format__

Each line of the input contains two integers, ___n___ and ___p___. The locked stub code in the editor reads the input and sends the value to the method as parameters.

__Constraints__

- __-10 <= _n_ <= 10__

- __-10 <= _p_ <= 10__

__Output Format__

Each line of the output contains the result ___n<sup>p</sup>___, if both ___n___ and ___p___ are positive. If either ___n___ or ___p___ is negative, the output contains "n and p should be non-negative". If both ___n___ and ___p___ are zero, the output contains "n and p should not be zero.". This is printed by the locked stub code in the editor.

__Sample Input 0__

```
3 5
2 4
0 0
-1 -2
-1 3
```

__Sample Output 0__

```
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
```

__Explanation 0__

- In the first two cases, both ___n___ and ___p___ are positive. So, the power function returns the answer correctly.

- In the third case, both ___n___ and ___p___ are zero. So, the exception, "n and p should not be zero.", is printed.

- In the last two cases, at least one out of ___n___ and ___p___ is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.

---

<details><summary>Solution</summary>
    
```java
class MyCalculator {

    public long power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(a, b);
    }

}
```
</details>
