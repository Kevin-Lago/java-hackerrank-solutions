| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.strings/pattern_syntax_checker)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.strings/java_regex_2_duplicate_words)</img> |
|:---|:---:|---:|

# Java Regex

Write a class called java.strings.java_regex.MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

> IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

Some valid IP addresses:

```
000.12.12.034
121.234.12.12
23.45.12.56
```

Some invalid IP addresses:

```
000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip
```

In this problem you will be provided java.strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the java.strings.java_regex.MyRegex class which contains a String ___pattern___. The string should contain the correct regular expression.

(java.strings.java_regex.MyRegex class MUST NOT be public)

__Sample Input__

```
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
```

__Sample Output__

```
true
true
true
false
false
false
```

---

<details><summary>Solution</summary>
    
```java
final class MyRegex {

    public String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}
```
</details>
