# Java Loops I

We use the integers _a, b,_ and _n_ to create the following series:

__(_a_ + 2<sup>0</sup> * _b_),(_a_ + 2<sup>0</sup> * _b_ + 2<sup>1</sup> * _b_), ... ,(_a_ + 2<sup>0</sup> * _b_ + 2<sup>1</sup> * _b_ + ... + 2<sup>_n_-1</sup> * _b_)__

You are given _q_ queries in the form of _a_, _b,_ and _n_. For each query, print the series corresponding to the given _a_, b_,_ and _n_ values as a single line of _n_ space-separated integers.

__Input Format__

The first line contains an integer, _q_, denoting the number of queries.

Each line _i_ of the _q_ subsequent lines contains three space-separated integers describing the respective _a_<sub>_i_</sub>, _b_<sub>_i_</sub>, and _n_<sub>_i_</sub> values for that query.

__Contraints__

- 0 <= _q_ <= 500

- 0 <= _a_, _b_ <= 50

- 1 <= _n_ <= 15

__Output Format__

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of _n_ space-separated integers.

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

1. We use _a_ = 0, _b_ = 2, and _n_ = 10 to produce some series _s_<sub>0</sub>, _s_<sub>1</sub>, ... , _s_<sub>_n_-1</sub>:

    - _s_<sub>0</sub> = 0 + 1 * 2 = 2
    - _s_<sub>1</sub> = 0 + 1 * 2 + 2 * 2 = 6
    - _s_<sub>2</sub> = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14
    
    ... and so on.
    
    Once we hit _n_= 10, we print the first ten terms as a single line of space-separated integers.
    
2. We use _a_ = 5, _b_ = 3, and _n_ = 5 to produce some series _s_<sub>0</sub>, _s_<sub>1</sub>, ... , _s_<sub>_n_-1</sub>:
    
    - _s_<sub>0</sub> = 5 + 1 * 3 = 8
    - _s_<sub>1</sub> = 5 + 1 * 3 + 2 * 3 = 14
    - _s_<sub>2</sub> = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26
    - _s_<sub>3</sub> = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50
    - _s_<sub>4</sub> = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98

    We then print each element of our series as a single line of space-separated values.
    
__Solution__

```java
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
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
