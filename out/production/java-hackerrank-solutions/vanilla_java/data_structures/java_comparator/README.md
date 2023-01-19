| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Comparator

Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

The Player class is provided for you in your editor. It has __2__ fields: a ___name___ String and a ___score___ integer.

Given an array of ___n___ Player objects, write a comparator that sorts them in order of decreasing score; if __2__ or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the [Comparator.compare(T o1, T o2)]() method.

__Input Format__

Input from stdin is handled by the locked sub code in the Solution class.

The first line contains an integer, ___n___, denoting the number of players.

Each of the ___n___ subsequent lines contains a player's ___name___ and ___score___, respectively.

__Constraints__

- $0 \le score \le 1000$

- __2__ players can have the same name.

- Player names consist of lowercase English letters.

__Output Format__

Yo uare not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

__Sample Input__

```
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
``` 

__Sample Output__

```
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
```

---

<details><summary>Solution</summary>
    
```java
import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score > p2.score) {
            return -1;
        } else if (p1.score < p2.score) {
            return 1;
        }
        return p1.name.compareToIgnoreCase(p2.name);
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
```
</details>