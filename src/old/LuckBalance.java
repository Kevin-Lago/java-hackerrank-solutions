import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LuckBalance {

    public static void main(String[] args) {

        int[][] contests = {
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0}
        };

        luckBalance(3, contests);

    }

    static int luckBalance(int k, int[][] contests) {

        int luck = 0;
        List<Integer> importants = new ArrayList<>();

        for (int i = 0; i < contests.length; i++) {
            luck += contests[i][0];
            if (contests[i][1] == 1) {
                importants.add(contests[i][0]);
            }
        }

        Collections.sort(importants);

        for (int i = importants.size() - 1; i >= 0; i--) {
            if (k <= 0) {
                luck -= importants.get(i);
            }
            k--;
        }

        return luck;


    }

}
