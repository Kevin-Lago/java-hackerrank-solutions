| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.object_oriented_programming/java_inheritance_i)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.object_oriented_programming/java_abstract_class)</img> |
|:---|:---:|---:|

# Java Inheritance II

Write the following code in your editor below:

1. A class named Arithmetic with a method named add that takes __2__ integers as parameters and returns an integer denoting their sum.

2. A class named Adder that inherits from a superclass named Arithmetic.

You classes should not be __public__

__Input Format__

You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it __2__ integer parameters.

__Output Format__

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

__Sample Output__

The main method in the Solution class above should print the following:

```
My superclass is: Arithmetic
42 13 20
```

---

<details><summary>Solution</summary>
    
```java
class Arithmetic {

    long add(int a, int b) {
        return a + b;
    }

}

class Adder extends Arithmetic { }
```
</details>