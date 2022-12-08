| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/introduction/java_end_of_file)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/introduction/java_int_to_string)</img> |
|:---|:---:|---:|

# Java Static Initializer Block

Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it [here](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html).

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth ___b___ and height ___h___. You should read the variables from the standard input.

If ___b_ <= 0__ or ___h_ <= 0__, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

__Input Format__

There are two lines of input. The first line contains ___b___: the breadth of the parallelogram. The next line contains ___h___: the height of the parallelogram.

__Constaints__

- __-100 <= _b_ <= 100__

- __-100 <= _h_ <= 100__

__Output Format__

If both values are greater than zero, then the main method must output the area of the parallelogram.

Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

__Sample Input 0__

```
1
3
```

__Sample Output 0__

```
3
```

__Sample Input 1__

```
-1
2
```

__Sample Output 1__

```
java.lang.Exception: Breadth and height must be positive
```

---

<details><summary>Solution</summary>
    
```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int b = scan.nextInt();
    int h = scan.nextInt();

    if (b <= 0 || h <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    } else {
        System.out.println(b * h);
    }
}
```
</details>
