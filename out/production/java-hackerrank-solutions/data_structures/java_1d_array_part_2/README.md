| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java 1D array part 2

Let's play a game on an array! You're standing at index __0__ of an ___n___-element array named ___game___. From some index ___i___ (where __0 <= _i_ <= _n___), you can perform one of the following moves:

- Move Backward: If cell ___i_ - 1__ exists and contains a __0__, you can walk back to cell ___i_ - 1__.

- Move Forward:

    - If cell ___i_ + 1__ contains a zero, you can walk to cell ___i_ + 1__
    
    - If cell ___i + lead___ contains a zero, you can jump to cell ___i + leap___
    
    - If you're standing in cell ___n_ - 1__ or the value of ___i + lead >= n___, you can walk or jump off the end of the array and win that game.
    
In other words, you can move from index ___i___ to index ___i + 1, i - 1___, or ___i + lead___ as long as the destination index is a cell containing a __0__. If the destination index is greater than ___n - 1___, you win the game.

__Function Description__

Complete the canWin function in the editor below.

canWin has the following parameters:

- int leap: the size of the leap

- int game[n]: the array to traverse

__Returns__

- boolean: true if the game can be won, otherwise false

__Input Format__

The first line contains an integer, ___q___, denoting the number of queries (i.e., function calls).

The __2 * _q___ subsequent lines describe each query over two lines:

1. The first line contains two space-separated integers describing the respective values of ___n___ and ___leap___.

2. The second line contains ___n___ space-separated binary integers (i.e., zeros and ones) describing the respoective values of ___game<sub>0</sub>, game<sub>1</sub>, ... , game<sub>n-1</sub>.

__Constraints__

- __1 <= _q_ <= 5000__

- __2 <= _n_ <= 100__

- __0 <= _lead_ <= 100__

- It is guaranteed that the value of ___game_[0]__ is always __0__.

__Sample Input__

```
STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
```

__Sample Output__

```
YES
YES
NO
NO
```

__Explanation__

We perform the following ___q_ = 4__ queries:

1. For ___game_ = [0,0,0,0,0]__ and ___leap_ = 3__, we can walk and/or jump to the end of the array because every cell contains a __0__. Because we can win, we return true.

2. For ___game_ = [0,0,0,1,1,1]__ and ___leap_ = 5__, we can walk to index __1__ and then jump ___i + leap_ = 1 + 5 = 6__ units to the end of the array. Because we can win, we return true.

3. For ___game_ = [0,0,1,1,1,0]__ and ___leap_ = 3, there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.

4. For ___game_ = [0,1,0]__ and ___leap_ = 1__, there is no way for us to get past the one at index __1__. Because we cannot win, we return false.

---

<details><summary>Solution</summary>
    
```java

```
</details>
