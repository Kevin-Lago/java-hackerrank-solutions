package vanilla_java.data_structures.java_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            l.add(scan.nextInt());
        }

        int q = scan.nextInt();

        while(q > 0) {
            String query = scan.next();

            if (query.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                l.add(x, y);
            } else if (query.equals("Delete")) {
                int x = scan.nextInt();

                l.remove(x);
            }

            q--;
        }

        l.stream().forEach(e -> System.out.print(e + " "));
    }

}
