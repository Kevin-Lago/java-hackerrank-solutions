# Java String Tokens

Given a string, ___s___, matching the regular expression ```[A-Za-z !,?._'@]+```, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

__Note:__ You may find the [String.split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-) method helpful in cpmleting this challenge.

__Input Format__

A single string, ___s___.

__Constraints__

- __1 <= _length of s_ <= 4 * 10<sup>5</sup>

- ___s___ is composed of any of the following: Enligh alphabetic letters, blank spaces, exclamation points (```!```), commas (```,```), question marks (```?```), periods (```.```), underscores (```_```), apostrophes (```'```), and at symbols (```@```).

__Output Format__

On the first line, print an integer, ___n___, denoting the number of tokens in string ___s___ (they do not need to be unique). Next, print each of the ___n___ tokens on a new line in the same order as they appear in input string ___s___.

__Sample Input__

```
He is a very very good boy, isn't he?
```

__Sample Output__

```
10
He
is
a
very
very
good
boy
isn
t
he
```

__Explanation__

We consider a token to be a contiguous segment of alphabetic characters. There are a total of __10__ such tokens in string ___s___, and each token is printed in the same order in which it appears in string ___s___.

__Solution__

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine().trim();
    scan.close();

    if (s.length() == 0) {
        System.out.println(0);
        return;
    }

    String[] tokens = s.split("[\\s!,?._'@]+");

    System.out.println(tokens.length);

    for (String token : tokens) {
        System.out.println(token);
    }
}
```
