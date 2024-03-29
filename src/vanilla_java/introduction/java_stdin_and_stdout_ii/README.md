| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.introduction/java_if_else)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.introduction/java_output_formatting)</img> |
|:---|:---:|---:|

# Java Stdin and Stdout II

In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

__Note:__ We recommend completing [Java Stdin and Stdout I](https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true) before attempting this challenge.

__Input Format__

There are three lines of input:

1. The first line contains an integer.

2. The second line contains a double.

3. The third line contains a String.

__Output Format__

There are three lines of output:

1. On the first line, print ```String:``` followed by the unaltered String read from stdin.

2. On the second line, print ```Double:``` followed by the unaltered double read from stdin.

3. On the third line, print ```Int:``` followed by the unaltered integer read from stdin.

To make the problem easier, a portion of the code is already provided in the editor.

__Note:__ If you use the [nextLine()](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html#nextLine--) method immediately following the [nextInt()](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html#nextInt--) method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the interger line (which is empty).

__Sample Input__

```
42
3.1415
Welcome to HackerRank's Java tutorials!
```

__Sample Output__

```
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```

---

<details><summary>Solution</summary>
    
```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}
```
</details>
