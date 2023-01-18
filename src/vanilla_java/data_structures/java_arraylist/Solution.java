package vanilla_java.data_structures.java_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();

            if (d != 0) {
                List<Integer> integers = Arrays.stream(scan.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
                arr.add(integers);
            } else {
                arr.add(new ArrayList<>());
            }
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            try {
                System.out.println(arr.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }

}
