| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Sort

You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two students have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

__Hint:__ You can use comparators to sort a list of objects. See the [oracle docs](https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html) to learn about comparators.

__Input Format__

The first line of input contains an integer ___n___, representing the total number of students. The next ___n___ lines contains a list of student information in the following structure:

```
ID Name CGPA
```

__Constraints__

__2 <= _n_ <= 1000__

__0 <= ___ID___ <= 100000__

__5 <= |_name_| <= 30__

__0 <= _CGPA_ <= 4.00__

The name contains only lowercase English letters. The ___ID___ contains only integer numbers wihtout leading zeros.

The CGPA will contain, at most, 2 digits after the decimal point.

__Output Format__

After rearranging the students according to the above rules, print the first name of each student on a separate line.

__Sample Input__

```
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
```

__Sample Output__

```
Ashis
Fahim
Samara
Samiha
Rumpa
```

---

<details><summary>Solution</summary>
    
```java

```
</details>