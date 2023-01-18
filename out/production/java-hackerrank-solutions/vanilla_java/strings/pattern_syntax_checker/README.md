| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.strings/java_string_tokens)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.strings/java_regex)</img> |
|:---|:---:|---:|

# Pattern Syntax Checker

Using ___regex___, we can easily match or search for patterns in text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

__Note:__ in this problem, a regex sequence is only valid if you can compile it using the [Pattern.compile](https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29) method.

__Input Format__

The first line of input contains an integer ___n___, denoting the number of test cases. The next ___n___ lines contain a string of any printable characters representing the pattern of a regex sequence.

__Output Format__

For each test case, print ```Valid``` if the syntax of the given pattern is correct. Otherwise, print ```Invalid```. 

__Sample Input__

```
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
```

__Sample Output__

```
Valid
Invalid
Invalid
```

---

<details><summary>Solution</summary>
    
```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = Integer.parseInt(scan.nextLine());
    while (testCases > 0) {
        String pattern = scan.nextLine();

        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }

        testCases -= 1;
    }
}
```
</details>
