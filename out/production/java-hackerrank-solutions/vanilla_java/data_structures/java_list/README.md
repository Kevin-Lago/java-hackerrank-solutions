| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java List

For this problem, we have __2__ types of queries you can perform on a [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html):

1. Insert ___y___ at index ___x___:

```
Insert
x y
```

2. Delete the element at index ___x___:

```
Delete
x
```

Given a list, ___l___, of ___n___ integers, perform ___q___ queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

__Input Format__

The first line contains an integer, ___n___ (the initial number of elements in ___l___).

The second line contains ___n___ space-separated integers describing ___l___.

The third line contains an integer, ___q___ (the number of queries).

The ___2q___ subsequent lines describe the queries, and each query is described over two lines:

- If the first line of query contains the String __insert__, then the second line contains two space-separated integers ___x___, ___y___ and the value ___y___ must be inserted into ___l___ at index ___x___.

- If the first line of query contains the String __Delete__, then the second line contains index ___x___, whose element must be deleted from ___l___.

__Constraints__

- __1 <= _n_ <= 4000__

- __1 <= _q_ <= 4000__

- Each element in is a 32-bit integer.

__Output Format__

Print the updated list ___l___ as a single line of space-separated integers.

__Sample Input__

```
5
12 0 1 78 12
2
Insert
5 23
Delete
0
```

__Sample Output__

```
0 1 78 12 23
```

__Explanation__

___l_ = [12, 0, 1, 78, 12]__

___q_<sub>0</sub>__: __Insert__ 23 at index __5__.

___l_<sub>0</sub>: [12, 0, 1, 78, 12, 23]__

___q_<sub>1</sub>__: __Delete__ the element at index __0__.

___l_<sub>1</sub>__: __[0, 1, 78, 12, 23]__

Having performed all ___q___ queries, we print the ___l_<sub>1</sub>__ as a single line of space-separated integers.

---

<details><summary>Solution</summary>
    
```java

```
</details>