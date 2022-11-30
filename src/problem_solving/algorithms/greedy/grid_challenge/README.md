# Grid Challenge

Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return ```YES``` if they are or ```NO``` if they are not.

__Example__

_grid_ = ['abc', 'ade', 'efg']

The grid is illustrated below

```
a b c
a d e
e f g
```

The rows are already in alphabetical order. The columns ```a a e```, ```b d f``` and ```ceg``` are also in alphabetical order, so the answer would be ```YES```. Only elements within the same row can be rearranged. They cannot be moved to a different row.

__Function Description__

Complete the gridChallenge function in the editor below.

gridChallenge has the following parameter(s):

- string grid[n]: an array of strings

__Returns__

- string: either ```YES``` or ```NO```

__Input Format__

The first line contains _t_, the numbers of testcases.

Each of the next _t_ sets of lines are described as follows:

- The first line contains _n_, the number of rows and columns in the grid.

- The next _n_ lines contains a string of length _n_

__Constraints__

__1 <= _t_ <= 100__

__1 <= _n_ <= 100__

Each string consists of lowercase letters in the range ascii[a-z]

__Output Format__

For each test case, on a separate line print ```YES``` if it is possible to rearrange the grid alphabetically ascending in both its rows and columns, or ```NO``` otherwise.

__Sample Input__

```
STDIN   Function
-----   --------
1       t = 1
5       n = 5
ebacd   grid = ['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']
fghij
olmkn
trpqs
xywuv
```

__Sample Output__

```
YES
```

__Explanation__

The __5__x__5__ grid in the __1__ test case can be reordered to

```
abcde
fghij
klmno
pqrst
uvwxy
```

This fulfills the conditions since the rows 1, 2, ..., 5 and the columns 1, 2, ..., 5 are all alphabetically sorted.

__Solution__

```java
public class Result {

    static String gridChallenge(String[] grid) {
        String answer = "YES";

        for (int i = 0; i < grid.length; i++) {
            char[] orderedString = grid[i].toCharArray();
            Arrays.sort(orderedString);
            grid[i] = String.valueOf(orderedString);
        }

        for (int i = 0; i < grid[0].length(); i++) {
            String columnString = "";
            for (int j = 0; j < grid.length; j++) {
                columnString += grid[j].charAt(i);
            }
            char[] orderedString = columnString.toCharArray();
            Arrays.sort(orderedString);
            if (!columnString.equals(String.valueOf(orderedString))) {
                answer = "NO";
            }
        }

        return answer;
    }

}
```
