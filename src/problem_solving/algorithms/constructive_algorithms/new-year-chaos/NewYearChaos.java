import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        int max = q.length;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] > i + 3) {
                System.out.println("Too chaotic");
                return;
            } else if (q[i] == max && max - i == 2) {
                bribes++;
                q[i] = q[i + 1];
                q[i + 1] = max;
                max--;
                i = max;
            } else if (q[i] == max && max - i == 3) {
                bribes += 2;
                q[i] = q[i + 1];
                q[i + 1] = q[i + 2];
                q[i + 2] = max;
                max--;
                i = max;
            } else if (q[i] == max) {
                max--;
            }
        }

        System.out.println(bribes);
    }

}


public class NewYearChaos {

//    public static void main(String[] args) {
//        int[] q = {5, 1, 2, 3, 7, 8, 6, 4};
//        minimumBribes(q);
//
//        int[] q1 = {1, 2, 5, 3, 4, 7, 8, 6};
//        minimumBribes(q1);
//
//        int[] a2 = {2, 1, 5, 3, 4};
//        minimumBribes(a2);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    static void minimumBribes(int[] q) {
        int bribes = 0;
        int max = q.length;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] > i + 3) {
                System.out.println("Too chaotic");
                return;
            } else if (q[i] == max && max - i == 2) {
                bribes++;
                q[i] = q[i + 1];
                q[i + 1] = max;
                max--;
                i = max;
            } else if (q[i] == max && max - i == 3) {
                bribes += 2;
                q[i] = q[i + 1];
                q[i + 1] = q[i + 2];
                q[i + 2] = max;
                max--;
                i = max;
            } else if (q[i] == max) {
                max--;
            }
        }

        System.out.println(bribes);
    }

}
