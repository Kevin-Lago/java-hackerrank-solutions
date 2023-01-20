package vanilla_java.data_structures.java_1d_array_part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static boolean back(int i, int leap, int[] game, List<Integer> backs) {
        if (backs.contains(i)) {
            return false;
        }

        if (i - 1 >= 0 && game[i - 1] == 0) {
            backs.add(i);
            i--;
        } else {
            return false;
        }

        return jump(i, leap, game, backs) || back(i, leap, game, backs);
    }

    public static boolean jump(int i, int leap, int[] game, List<Integer> backs) {
        int n = game.length;

        if (leap == 0) {
            return false;
        }

        if (i + leap >= n || i + 1 >= n) {
            return true;
        }

        if (i + leap < n && game[i + leap] == 0) {
            i += leap;
        } else {
            return false;
        }

        return jump(i, leap, game, backs) || walk(i, leap, game, backs) || back(i, leap, game, backs);
    }

    public static boolean walk(int i, int leap, int[] game, List<Integer> backs) {
        int n = game.length;

        if (i + leap >= n || i + 1 >= n) {
            return true;
        }

        if (i + 1 < n && game[i + 1] == 0) {
            i++;
        } else {
            return false;
        }

        return jump(i, leap, game, backs) || walk(i, leap, game, backs);
    }

    public static boolean canWin(int leap, int[] game) {
        int i = 0;
        int n = game.length;
        List<Integer> backs = new ArrayList<>();

        if (i + leap >= n || i + 1 >= n) {
            return true;
        }

        return jump(i, leap, game, backs) || walk(i, leap, game, backs);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
