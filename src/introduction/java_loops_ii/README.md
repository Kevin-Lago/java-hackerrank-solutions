| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/introduction/java_loops_i)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/introduction/java_datatypes)</img> |
|:---|:---:|---:|

# Java Loops I

We use the integers _a, b,_ and _n_ to create the following series:

__(_a_ + 2<sup>0</sup> * _b_),(_a_ + 2<sup>0</sup> * _b_ + 2<sup>1</sup> * _b_), ... ,(_a_ + 2<sup>0</sup> * _b_ + 2<sup>1</sup> * _b_ + ... + 2<sup>_n_-1</sup> * _b_)__

You are given _q_ queries in the form of _a_, _b,_ and _n_. For each query, print the series corresponding to the given _a_, b_,_ and _n_ values as a single line of _n_ space-separated integers.

__Input Format__

The first line contains an integer, ___q___, denoting the number of queries.

Each line ___i___ of the ___q___ subsequent lines contains three space-separated integers describing the respective ___a<sub>i</sub>___, ___b<sub>i</sub>___, and ___n<sub>i</sub>___ values for the query.

__Constraints__

- __0 <= _q_ <= 500__

- __0 <= _a_, _b_ <= 50__

- __1 <= _n_ <= 15__

__Output Format__

For each query, print the corresponding series on a new line. Each series must be printed in oder as a single line on ___n___ space-separated integers.

__Sample Input__

```
2
0 2 10
5 3 5
```

__Sample Output__

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

__Explanation__

We have two queries:

1. We use ___a_ = 0__, ___b_ = 2__, and ___n_ = 10__ to produce some series ___s<sub>0</sub>_, s<sub>1</sub>, ... , s<sub>n-1</sub>__:

    - ___s_<sub>0</sub> = 0 + 1 * 2 = 2__
    
    - ___s_<sub>1</sub> = 0 + 1 * 2 + 2 * 2 = 6__
    
    - ___s_<sub>2</sub> = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14__
    
    ... and so on.
    
    Once we hit ___n_ = 10__, we print the first ten terms as a single line of space-separated integers.
    
2. We use ___a_ = 5__, ___b_ = 3__, and ___n_ = 5__ to produce some series ___s<sub>0</sub>_, s<sub>1</sub>, ... , s<sub>n-1</sub>__:

    - ___s_<sub>0</sub> = 5 + 1 * 3 = 8__
    
    - ___s_<sub>1</sub> = 5 + 1 * 3 + 2 * 3 = 14__
    
    - ___s_<sub>2</sub> = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26__
    
    - ___s_<sub>3</sub> = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50__
    
    - ___s_<sub>4</sub> = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98__
    
    We then print each element of our series as a single line of space-separated values.
    
---

<details><summary>Solution</summary>
    
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();
    }

}
```
</details>
