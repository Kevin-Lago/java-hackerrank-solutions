# Java String Reverse

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

---

Given a String ___a___, print ```Yes``` if it is a palindrome, print ```No``` otherwise.

__Sample Input__

```madam```

__Sample Output__

```
Yes
```

__Solution__

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();

    for (int i = 0; i < a.length() / 2; i++) {
        if (!a.substring(i, i + 1).equals(a.substring(a.length() - i - 1, a.length() - i))) {
            System.out.println("No");
            return;
        }
    }

    System.out.println("Yes");
}
```
