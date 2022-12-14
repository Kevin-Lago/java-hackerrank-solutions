| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Subarray

We define the following:

- A subarray of an ___n___-element array composed from a contiguous block of the original array's elements. For example, if ___array___ = __[1, 2, 3]__, then the subarrays are __[1], [2], [3], [1,2]__ and __[1,2,3]__. Something like __[1,3]__ would not be a subarray as it's not a contiguous subsection of the original array.

- The sum of an array is the total sum of its elements.

    - An array's sum is negative if the total sum of its elements is negative.
    
    - An array's sum is positive if the total sum of its elements is positive.
    
Given an array of ___n___ integers, find and print its number of negative subarrays on a new line.

__Input Format__

The first line contains a single integer, ___n___, denoting the length of array __a__ = __[a<sub>0</sub>,a<sub>1</sub>,...,a<sub>n-1</sub>]__.

The second line contains ___n___ space-separated integers describing each respective element, ___a<sub>i</sub___, in array ___a___.

__Constraints__

- $1 \le n \le 100$

- $-10^4 \le a_{i} \le 10^4$

__Output Format__

Print the number of subarrays of ___a___ having negative sums.

__Sample Input__

```
5
1 -2 4 -5 1
```

__Sample Output__

```
9
```

__Explanation__

There are nine negative subarrays of ___a___ = __[1,-2,4,-5,1]__:

1. $[1 : 1] => -2$

2. $[3 : 3] => -5$

3. $[0 : 1] => 1 + -2 = -1$

4. $[2 : 3] => 4 + -5 = -1$

5. $[3 : 4] => -5 + 1 = -4$

6. $[1 : 3] => -2 + 4 + -5 = -3$

7. $[0 : 3] => 1 + -2 + 4 + -5 = -2$

8. $[1 : 4] => -2 + 4 + -5 + 1 = -2$

9. $[0 : 4] => 1 + -2 + 4 + -5 + 1 = 1$

Thus, we print __9__ on a new line.

---

<details><summary>Solution</summary>
    
```java

```
</details>