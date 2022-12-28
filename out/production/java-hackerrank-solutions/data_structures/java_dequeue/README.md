| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Dequeue

In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as ```LinkedList``` or ```ArrayDeque``` classes. For example, deque can be decalred as:

```java
Deque deque = new LinkedList<>();
```

or

```java
Deque deque = new ArrayDeque<>();
```

You can find more details about Deque [here]().

In this problem, you are given $n$ integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size $m$.

__Note:__ Time limit is $3$ seconds for this problem.

__Input Format__

The first line of input contains two integers $n$ and $m$: representing the total number of integers and the size of the subarray, respectively. The next line contains $n$ space-separated integers.

__Constraints__

- $1 \le n \le 100000$

- $1 \le m \le 100000$

- $m \le n$

The numbers in the array will range between $[0, 10000000]$

__Output Format__

Print the maximum number of unique integers among all possible contiguous subarrays of the size $m$.

__Sample Input__

```
6 3
5 3 5 2 3 2
```

__Sample Output__

```
3
```

__Explanation__

In the sample testcase, there are 4 subarrays of contiguous numbers.

$s1 = {5,3,5}$ - Has $2$ unique numbers.

$s2 = {3,5,2}$ - Has $3$ unique numbers.

$s3 = {5,2,3}$ - Has $3$ unique numbers.

$s4 = {2,3,2}$ - Has $2$ unique numbers.

In these subarrays, there are $2, 3, 3, 2$ unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is $3$.

---

<details><summary>Solution</summary>
    
```java

```
</details>