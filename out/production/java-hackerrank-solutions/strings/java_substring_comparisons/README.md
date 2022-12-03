# Java Substring Comparisons

We define the following terms:

- [Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographic_order), also knoen as alphabetic or dictionary order, orders characters as follows:

__A < B < ... < Y < Z < a < b < ... < y < z__

For example, ```ball < cat, dog < dorm, Happy < happy, Zoo < ball```.

- A [Substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of ```abc``` are ```a```, ```b```, ```c```, ```ab```, ```bc```, and ```abc```.

Given a string, ___s___, and an integer, ___k___, complete the function so that it finds the lexicographically smallest and largest substrings of length ___k___.

__Function Description__

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

- string s: a string

- int k: the length of the substrings to find

__Returns__

- string: the string ' + "\n" + ' where and are the two substrings

__Input Format__

The first line contains a string denoting ___s___.

The second line contains an integer denoting ___k___.

__Constraints__

- __1 <= |_s_| <= 1000__

- ___s___ consists of English alphabetic letters only (i.e., ```[a-zA-Z]```)

__Sample Input 0__

```
welcometojava
3
```

__Sample Output 0__

```
ava
wel
```

__Explanation 0__

String ___s_ = "welcometojava"__ has the following lexicographically-ordered substrings of length ___k_ = 3__:

__["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]__

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline- separated values (i.e., ```ava\nwel```).

The stub code in the editor then prints ```ava``` as our fist line of output and ```wel``` as our second line of output.

__Solution__

```java

```
