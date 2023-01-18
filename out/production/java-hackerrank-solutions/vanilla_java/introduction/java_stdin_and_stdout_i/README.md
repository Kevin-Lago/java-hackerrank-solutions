| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.introduction/welcome_to_java)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.introduction/java_if_else)</img> |
|:---|:---:|---:|

# Java Srdin and Stidout I

Most HackerRank challenges require you to read input from [stdin](https://en.wikipedia.org/wiki/Standard_streams#Standard_input_.28stdin.29) (standard input) and write output to [stdout](https://en.wikipedia.org/wiki/Standard_streams#Standard_output_.28stdout.29) (Standard Output).

One popular way to read input from stdin is by using the [Scanner Class](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html) and specifying the Input Stream as System.in. For example:

```java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

The code above creates a Scanner object named ___scanner___ and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and print to stdout using System.out.println(String).

So. of our input is:

```
Hi 5
```

Our code will print:

```
myString is: Hi
myInt is: 5
```

Alternatively, you can use the [BufferedReader Class](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html).

__Task__

In this challenge, you must read ___3___ integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

__Input Format__

There are ___3___ line of input, and each line contains a single integer.

__Sample Input__

```
42
100
125
```

__Sample Output__

```
42
100
125
```

---

<details><summary>Solution</summary>
    
```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
```
</details>
