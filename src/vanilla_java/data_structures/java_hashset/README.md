| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Hashset

> In computer science, a set is an abstract data type that can store certain values, without any particular order. [(Wikipedia)](https://en.wikipedia.org/wiki/Set_(abstract_data_type)). 

__{1, 2, 3}__ is an example of a set, but __{1,2,2}__ is not a set. Today you will learn how to use sets in java by solving this problem.

You are given ___n___ pairs of java.strings. Two paris __(_a, b_)__ and __(_c, d_)__ are identical if ___a___ = ___c___ and ___b___ = ___d___. That also implies __(_a, b_)__ is not the same as __(_b, a_)__. After taking each pair as input, you need to print the number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

__Input Format__

In the first line, there will be an integer ___t___ denoting the number of pairs. Each of the next ___t___ lines will contains two java.strings separated by a single space.

__Constraints__

- __1 <= _t_ <= 100000__

- Length of each string is almost __5__ and will consist lower case letters only.

__Output Format__

Print ___t___ lines. In the ___i<sup>th</sup>___ line, print the number of unique pairs you have after taking the ___i<sup>th</sup>___ pair as input.

__Sample Input__

```
5
john tom
john mary
john tom
mary anna
mary anna
```

__Sample Output__

```
1
2
2
3
3
```

__Explanation__

- After taking the first input, you have only on pair: (john, tom)

- After taking the second input, you have two pairs: (john, tom) and (john, mary)

- After taking the third input, you still have two unique pairs.

- after taking the fourth input, you have three unique pairs: (john, tom), (john, mary) and (mary, anna)

- After taking the fifth input, you still have three unique pairs.

---

<details><summary>Solution</summary>
    
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> pairs = new HashSet();

        for (int i = 0; i < t; i++) {
            pairs.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pairs.size());
        }
    }

}
```
</details>