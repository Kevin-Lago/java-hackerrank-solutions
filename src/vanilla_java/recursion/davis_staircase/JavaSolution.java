package vanilla_java.recursion.davis_staircase;

import java.util.Scanner;

public class JavaSolution {

    public static int stepPerms(int n) {
        // Write your code here

        // Steps of either 1, 2 or 3
        // n number of total steps
        // find unique arrays that total n

        // n = 3
        // 1 -> 1 -> 1
        // 1 -> 2
        // 2 -> 1
        // 3

        // n = 4
        // 1 -> 1 -> 1 -> 1
        // 2 -> 1 -> 1
        // 2 -> 2
        // 3 -> 1

        int count = 0;
        boolean counting = true;

        while(counting) {
            for (int i = 0; i < n; i++) {

                // maybe just make all upwards combinations then reverse
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(stepPerms(n));
    }

}
