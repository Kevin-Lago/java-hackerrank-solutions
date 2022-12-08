| <img width=1000>[Previous Questions](https://github.com/Kevin-Lago/java-hackerrank-solutions/introduction/java_output_formatting)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/introduction/java_loops_i)</img> |
|:---|:---:|---:|

# Java Loops I

__Objective__

In this challenge, we're going to use loops to help us do some simple math.

__Task__

Given an integer, _n_, print its first __10__ multiples. Each multiple _n_ x _i_ (where 1 <= _i_ <= 10) should be printed on a new line in the form: ```n x i = result```

__Input Format__

A single integer, _n_.

__Constraints__

- 2 <= _n_ <= 20

__Output Format__

Print __10__ lines of output; each line _i_ (where 1 <= _i_ <= 10) contains the _result_ of ```n x i = result```

__Sample Input__

```
2
```

__Sample Output__

```
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

---

<details><summary>Solution</summary>
    
```java
public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    bufferedReader.close();

    for (int i = 1; i <= 10; i++) {
        System.out.printf("%d x %d = %d", n, i, n * i);
    }
}
```
</details>
