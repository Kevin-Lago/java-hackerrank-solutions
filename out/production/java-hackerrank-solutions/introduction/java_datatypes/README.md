| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/introduction/java_loops_ii)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/introduction/java_end_of_file)</img> |
|:---|:---:|---:|

# Java Datatypes

Java has 8 [primitve data types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html); char, boolean, byte, short, int, long, float and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, long):

- A byte is an 8-bit signed integer.

- A short is a 16-bit signed integer.

- An int is a 32-bit signed integer.

- A long is a 64-bit signed integer.

Given an input integer, you must determine which primitve data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

__Input Format__

The first line contains an integer, ___t___, denoting the number of test cases.

Each test case, ___t___, is comprised of a single line with an integer, ___n___, which can be arbitrarilt large or small.

__Output Format__

For each input variable ___n___ and appropriate primitive ___dataType___, you must determine if the given primitives are capable of storing it. If yes, then print:

```
n can be fitted in:
* dataType
```

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ___byte < short < int < long___).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

```
n can't be fitted anywhere.
```

__Sample Input__

```
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

__Sample Output__

```
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```

__Explanation__

__-150__ can be stored in a short, an int, or a long.

__21333333333333333333333333 is very large and is outside of the allowable range of values for the primitive data types discussed in his problem.

---

<details><summary>Solution</summary>
    
```java

```
</details>
