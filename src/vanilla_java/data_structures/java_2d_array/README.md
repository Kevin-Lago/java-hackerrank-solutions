| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java 2D Array

You are given __6 * 6__ 2D array. An hourglass is an array is a portion shaped like this:

```
a b c
  d
e f g
```

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

```
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
```

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4 and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

__Input Format__

There will be exactly __6__ lines, each containing __6__ integers separated by spaces. Each integer will be between __-9__ and __9__ inclusive.

__Output Format__

Print the answer to this problem on a single line.

__Sample Input__

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```

__Sample Output__

```
19
```

__Explanation__

The hourglass which has the largest sum is:

```
2 4 4
  2
1 2 4
```

---

<details><summary>Solution</summary>
    
```java
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int largestSum = Integer.MIN_VALUE;

        for (int c = 0; c <= 3; c++) {
            for (int r = 0; r <= 3; r++) {
                int sum = 0;

                sum += arr.get(r).get(c) + arr.get(r).get(c + 1) + arr.get(r).get(c + 2);
                sum += arr.get(r + 1).get(c + 1);
                sum += arr.get(r + 2).get(c) + arr.get(r + 2).get(c + 1) + arr.get(r + 2).get(c + 2);

                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }

        System.out.println(largestSum);
        bufferedReader.close();
    }
}
```
</details>