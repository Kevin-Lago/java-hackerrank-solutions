# Java Strings Introduction

> "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — [Wikipedia: String (computer science)](https://en.wikipedia.org/wiki/String_%28computer_science%29)

This exercise is to test your understanding of Java Strings. A saple String declaration:

```java
String myString = "Hello World!";
```

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, ___a___ and ___b___, perform the following operations.

1. Sum the lengths of ___a___ and ___b___.

2. Determine if ___a___ is lexicographically larger than ___b___ (i.e.: does ___b___ come before ___a___ in the dictionary?).

3. Capitalize the first letter in ___a___ and ___b___ and print them on a single line, separated by a space.

__Input Format__

The first line contains a string ___a___. The second line contains another string ___b___. The strings are comprised of only lowercase English letters.

__Output Format__

There are three lines of output:

For the first line, sum the lengths of ___a___ and ___b___.

For the second line, write ```Yes``` if ___a___ is lexicographically greater than ___b___ otherwise print ```No``` instead.

For the third line, capitalize the first letter in both ___a___ and ___b___ and print them on a single line, separated by a space.

__Sample Input 0__

```
hello
java
```

__Sample Output 0__

```
9
No
Hello Java
```

__Explanation 0__

String ___a___ is "hello" and string ___b___ is "java".

___a___ has a length of 5, and ___b___ has a length of 4; the sum of their lengths is 9.

When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, ___a___ is not greater than ___b___ and the answer is ```No```. 

When you capitalize the first letter of both ___a___ and ___b___ and then print them separated by a space, you get "Hello Java".

__Solution__

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();

    System.out.println(a.length() + b.length());
    System.out.println(b.compareTo(a) >= 0 ? "No" : "Yes");
    System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
}
```

