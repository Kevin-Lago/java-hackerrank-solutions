| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/can_you_access)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_factory_pattern)</img> |
|:---|:---:|---:|

# Prime Checker

You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime should contains a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments, You should write the checkPrime method in such a way that the code prints only the [prime numbers](https://en.wikipedia.org/wiki/Prime_number).

Please read the code given in the editor carefully. Also please do not use method overloading!

__Note:__ You may get a compile time error in this problem due to the statement below:

```
  BufferedReader br=new BufferedReader(new InputStreamReader(in));
```

This was added intentionally, and you have to figure out a way to get rid of this error.

__Input Format__

There are only five lines of input, each containing one integer.

__Output Format__

There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.

__Sample Input__

```
2
1
3
4
5
```

__Sample Output__

```
2 
2 
2 3 
2 3 5 
```

---

<details><summary>Solution</summary>
    
```java
import java.util.ArrayList;
import java.util.List;

class Prime {

    public void checkPrime(int ...n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {
            boolean isPrime = n[i] == 1 ? false : true;

            for (int j = 2; j <= n[i] / 2; j++) {
                if (n[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(n[i]);
            }
        }

        primes.forEach(prime -> System.out.print(prime + " "));
        System.out.println();
    }

}
```
</details>