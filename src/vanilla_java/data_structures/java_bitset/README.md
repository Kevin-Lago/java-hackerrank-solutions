| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java BitSet

Java's [BitSet]() class implements a vector of bit values (i.e.: $false(0)$ or $true(1)$) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of $1$ is called a set bit.

Given $2$ BitSets, $b_{1}$ and $b_{2}$, of size $n$ where all bits in both BitSets are initialized to $0$, perform a series of $m$ operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

__Input Format__

The first lien contains $2$ space-separated integers, $n$ (the length of both BitSets $b_{1}$ and $b_{2}$) and $m$ (the number of operations to perform), respectively.

The $m$ subsequent lines each contains an operation in one of the following forms:

- [AND]() $<set>$ $<set>$

- [OR]() $<set>$ $<set>$

- [XOR]() $<set>$ $<set>$

- [FLIP]() $<set>$ $<index>$

- [SET]() $<set>$ $<index>$

In the list above, $<set>$ is the integer $1$ or $2$, where $1$ denotes $b_{1}$ and $2$ denotes $b_{2}$.

$<index>$ is an integer denoting a bit's index in the BitSet corresponding to $<set>$.

For the binary operations $AND$, $OR$ and $XOR$, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

```
AND 2 1
```

$b_{2}$ is the left operand, and $b_{1}$ is the right operand. This operation should assign the result of $b_{2} \wedge b_{1}$ to $b_{2}$.

__Constraints__

- $1 \le n \le 1000$

- $1 \le m \le 10000$

__Output Format__

After each operations, print the respective number of set bits in BitSet $b_{1}$ and BitSet $b_{2}$ as $2$ space-separated integers on a new line.

__Sample Input__

```
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
```

__Sample Output__

```
0 0
1 0
1 1
1 2
```

__Explanation__

Initially: $n = 5$, $m = 4$, $b_{1} = {0,0,0,0,0}$ and $b_{2} = {0,0,0,0,0}$. At each step, we print the respective number of set bits in $b_{1}$ and $b_{2}$ as a pair of space-separated integers on a new line.

$m_{0} = AND 1 2$

$b_{1} = b_{1} \wedge b_{2} = {0,0,0,0,0} \wedge {0,0,0,0,0} = {0,0,0,0,0}$

$b_{1} = {0,0,0,0,0}, b_{2} = {0,0,0,0,0}$

The number of set bits in $b_{1}$ and $b_{2}$ is $0$

$m_{1} = SET 1 4$

Set $b_{1}[4]$ to $true(1)$

$b_{1} = {0,0,0,0,1}, b_{2} = {0,0,0,0,0}$

The number of set bits in $b_{1}$ is $1$ and $b_{2}$ is $0$

$m_{2} = FLIP 2 2$

Flip $b_{2}[2]$ from $false(0)$ to $true(1)$

$b_{1} = {0,0,0,0,1}, b_{2} = {0,0,1,0,0}$

The number of bit sets in $b_{1}$ is $1$ and $b_{2}$ is $1$.

$m_{3} = OR 2 1$

$b_{2} = b_{2} \vee b_{1} = {0,0,1,0,0} \vee {0,0,0,0,1} = {0,0,1,0,1}$

$b_{1} = {0,0,0,0,1}, b_{2} = {0,0,1,0,1}$

The number of set bits in $b_{1}$ is $1$ and $b_{2}$ is $2$

---

<details><summary>Solution</summary>
    
```java
import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();
        
        BitSet[] bs = new BitSet[2];
        bs[0] = b1;
        bs[1] = b2;
        
        for (int i = 0; i < m; i++) {
            String o = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            if (o.equals("AND")) {
                bs[x - 1].and(bs[y - 1]);
            } else if (o.equals("OR")) {
                bs[x - 1].or(bs[y - 1]);
            } else if (o.equals("XOR")) {
                bs[x - 1].xor(bs[y - 1]);
            } else if (o.equals("FLIP")) {
                bs[x - 1].flip(y);
            } else if (o.equals("SET")) {
                bs[x - 1].set(y);
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }

}
```
</details>