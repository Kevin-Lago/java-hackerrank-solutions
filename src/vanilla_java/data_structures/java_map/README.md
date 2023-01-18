| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Map

You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as a query. For each query, print the phone number of that person.

__Input Format__

The first line will have an integer ___n___ denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until the end-of-file.

__Constraints__

A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

__1 <= _n_ <= 100000__

__1 <= _query_ <= 100000__

__Output Format__

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

__Sample Input__

```
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
```

__Sample Output__

```
uncle sam=99912222
Not found
harry=12299933
```

---

<details><summary>Solution</summary>
    
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();

            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();

            System.out.println(phoneBook.get(s) != null ? s + "=" + phoneBook.get(s) : "Not found");
        }
    }

}
```
</details>