package vanilla_java.data_structures.java_1d_array_part_2;

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
//        for (int i = 0; i < game.length - leap; i++) {
//            if (game.length[i]) {
//
//            }
//        }

        boolean playing = true;
        int position = 0;

        while (playing) {
            try {
                if (game[position + leap] == 0) {
                    position = position + leap;
                    continue;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return true;
            }

            try {
                if (game[position + 1] == 0) {
                    position++;
                    continue;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return true;
            }

            try {
                for (int i = 1; i <= leap; i++) {
                    if (game[position - i + leap] == 0 && game[position - i] == 0) {
                        position = position - i + leap;
                        break;
                    }

                    if (i >= leap) {
                        return false;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }

        return false;
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
