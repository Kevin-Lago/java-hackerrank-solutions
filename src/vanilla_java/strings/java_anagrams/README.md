| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.strings/java_string_reverse)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.strings/java_string_tokens)</img> |
|:---|:---:|---:|

# Java Anagrams

Two java.strings, ___a___ and ___b___, are called anagrams if they contain all the same characters is the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of ```CAT``` are ```CAT```, ```ACT```, ```tac```, ```TCA```, ```aTC```, and ```CtA```.

__Function Description__

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

- String a: the first string

- String b: the second string

__Returns__

- boolean: if ___a___ and ___b___ are case-insensitive anagrams, return true. Otherwise, return false.

__Input Format__

The first line contains a string ___a___.

The second line contains string ___b___.

__Constraints__

- __1 <= _length(a)_, _length(b)_ <= 50__

- Strings ___a___ and ___b___ consist of English alphabetic characters.

- The comparison should NOT be case sensitive.

__Sample Input 0__

```
anagram
margana
```

__Sample Output 0__

```
Anagrams
```

__Explanation 0__

| Character          | Frequency: anagram | Frequency: margana |
|:------------------:|:------------------:|:------------------:|
| ```A``` or ```a``` | 3                  | 3                  |
| ```G``` or ```g``` | 1                  | 1                  |
| ```N``` or ```n``` | 1                  | 1                  |
| ```M``` or ```m``` | 1                  | 1                  |
| ```R``` or ```r``` | 1                  | 1                  |

The two java.strings contain all the same letters in the same frequencies, so we print "Anagrams".

__Sample Input 1__

```
anagramm
marganaa
```

__Sample Output 1__

```
Not Anagrams
```

__Explanation 1__

| Character          | Frequency: anagramm | Frequency: marganaa |
|:------------------:|:-------------------:|:-------------------:|
| ```A``` or ```a``` | 3                   | 4                   |
| ```G``` or ```g``` | 1                   | 1                   |
| ```N``` or ```n``` | 1                   | 1                   |
| ```M``` or ```m``` | 2                   | 1                   |
| ```R``` or ```r``` | 1                   | 1                   |

The two java.strings don't contain the same number of a's and m's, so we print "Not Anagrams".

__Sample Input 2__

```
hello
hello
```

__Sample Output 2__

```
Anagrams
```

__Explanation 2__

| Character          | Frequency: Hello | Frequency: hello |
|:------------------:|:----------------:|:----------------:|
| ```E``` or ```a``` | 3                | 3                |
| ```H``` or ```g``` | 1                | 1                |
| ```L``` or ```n``` | 1                | 1                |
| ```O``` or ```m``` | 1                | 1                |

The two java.strings contain all the same letters in the same frequencies, so we print "Anagrams".

---

<details><summary>Solution</summary>
    
```java
public static boolean isAnagram(String a, String b) {
    for (int i = 0; i < a.length(); i++) {
        for (int j = 0; j < b.length(); j++) {
            if (a.substring(i, i + 1).equalsIgnoreCase(b.substring(j, j + 1))) {
                a = a.substring(i + 1);
                b = j == 0 ? b.substring(j + 1) : b.substring(0, j) + b.substring(j + 1);
                i -= 1;

                break;
            }
        }
    }

    if (a.equals(b)) {
        return true;
    }

    return false;
}
```
</details>
