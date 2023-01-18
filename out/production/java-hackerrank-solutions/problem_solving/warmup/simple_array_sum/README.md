| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/python-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/python-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/python-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Simple Array Sum

Given an array of integers, find the sum of its elements.

For example, if the array $ar = [1,2,3]$, $1 + 2 + 3 = 6$, so returns $6$.

__Function Description__

Complete the simple_array_sum function in the editor below. It must return the sum of teh array's elements as an integer.

simple_array_sum has the following parameters(s):

- ar: an array of integers

__Input Format__

The first line contains an integer, $n$, denoting the size of the array.

The second line contains $n$ space-separated integers representing the array's elements.

__Constraints__

- $0 < n, ar[i] \le 1000$

__Output Format__

Print the sum of the array's elements as a single integer.

__Sample Input__

```
6
1 2 3 4 10 11
```

__Sample Output__

```
31
```

__Explanation__

We print the sum of the array's elements: $1 + 2 + 3 + 4 + 10 + 11 = 31$

---

<details><summary>Solution</summary>
    
```python
import os


def simple_array_sum(ar):
    return sum(ar)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())
    ar = list(map(int, input().rstrip().split()))
    result = simple_array_sum(ar)

    fptr.write(str(result) + '\n')
    fptr.close()
```
</details>
