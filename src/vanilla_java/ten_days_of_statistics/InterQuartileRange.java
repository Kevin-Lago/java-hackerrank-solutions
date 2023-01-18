package vanilla_java.ten_days_of_statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InterQuartileRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] f = new int[n];
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) x[i] = scan.nextInt();
        for (int i = 0; i < n; i++) f[i] = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f[i]; j++) {
                s.add(x[i]);
            }
        }

        Collections.sort(s);
        float size = s.size();
        float q1 = (size / 4);
        float q3 = (size / 2) + (size / 4);

        if ((size / 2) % 2 == 0) {
            q1 = (s.get((int)q1 - 1) + s.get((int)q1)) / 2;
            q3 = (s.get((int)q3 - 1) + s.get((int)q3)) / 2;
        } else {
            q1 = s.get((int)q1 - 1);
            q3 = s.get((int)q3 - 1);
        }

        System.out.println(q3 - q1);

    }

}
