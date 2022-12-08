| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/bignumber/java_bigdecimal)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/bignumber/java_biginteger)</img> |
|:---|:---:|---:|

# Java Primality Test

A prime number is a natural number greater than __1__ whose only positive divisors are __1__ and itself. For example, the first six prime numbers are __2, 3, 5, 7, 11,__ and __13__.

Given a large integer, ___n___, use the Java BigInteger class' [isProbablePrime]() method to determine and print whether it's ```prime``` or ```not prime```.

__Input Format__

A single line containing an integer, ___n___ (the number to be checked).

__Constraints__

- ___n___ contains at most __100__ digits.

__Output Format__

If ___n___ is a prime number, print ```prime```; otherwise, print ```not prime```.

__Sample Input__

```
13
```

__Sample Output__

```
prime
```

__Explanation__

The only positive divisory of 13 are 1 and 13, so we print ```prime```.

---

<details><summary>Solution</summary>
    
```java
public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String n = bufferedReader.readLine();
    BigInteger bigInteger = new BigInteger(n);

    bufferedReader.close();

    if (bigInteger.isProbablePrime(1)) {
        System.out.println("prime");
    } else {
        System.out.println("not prime");
    }
}
```
</details>
