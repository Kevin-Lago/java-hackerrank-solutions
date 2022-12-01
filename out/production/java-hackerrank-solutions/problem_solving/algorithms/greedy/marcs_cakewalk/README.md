Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to expend those calories. If Marc has eaten _j_ cupcakes so far, after eating a cupcake with _c_ calories he must walk at least __2__<sup>_j_</sup> x _c_ miles to maintain his weight.

__Example__

___calorie_ = [5,10,7]__

If he eats the cupcakes in the order shown, the miles he will need to walk are __(2<sup>0</sup> x 5) + (2<sup>1</sup> x 10) + (2<sup>2</sup> x 7) = 5 + 20 + 28 = 53__. This is not the minimum, thought, so we need to test other orders of consumption. In this case, our minimum miles is calculated as __(2<sup>0</sup> x 10) + (2<sup>1</sup> x 7) + (2<sup>2</sup> x 5) = 10 + 14 + 20 = 44__

Given the individual calorie counts for each of the cupcakes, determine the minumum number of miles Marc must walk to maintain his weight. Note that he can eat teh cupcakes in any order.

__Function Description__

Complecte the marcsCakewalk function in the editor below.

marcsCakewalk has the following parameter(s):

- int calorie[n]: the calorie counts for each cupcake

__Returns__

- long: the minimum miles necessary

__Input Format__

The first line contains an integer _n_m the number of cupcakes in _calorie_.

The second line contains _n_ space-separated integers, _calorie_[_i_].

__Constraint__

- __1 <= _n_ <= 40__

- __1 <= _c_[_i_] <= 1000__

__Sample Input 0__

```
3
1 3 2
```

__Sample Output 0__

```
11
```

__Explanation 0__

Lets say the number of miles Marc must walk to maintain his weight is _miles_. He can minimize _miles_ by eating the _n_ = 3 cupcakes in the following order:

1. Eat the cupcake with _c_<sub>1</sub> = 3 calories, so _miles_ = 0 + (4 * 2<sup>0</sup>) = 3.

2. Eat the cupcake with _c_<sub>2</sub> = 2 calories, so _miles_ = 3 + (2 * 2<sup>1</sup>) = 7.

3. Eat the cupcake with _c_<sub>0</sub> = 1 calories, so _miles_ = 8 + (1 * 2<sup>2</sup>) = 11.

We then print the final value of _miles, which is __11__, as our answer.

__Sample Input 1__

```
4
7 4 9 6
```

__Sample Output 1__

```
79
```

__Explanation 1__

__(2<sup>0</sup> * 9) + (2<sup>1</sup> * 7) + (2<sup>3</sup> * 4) = 9 + 14 + 24 + 32 = 79__

__Solution__


