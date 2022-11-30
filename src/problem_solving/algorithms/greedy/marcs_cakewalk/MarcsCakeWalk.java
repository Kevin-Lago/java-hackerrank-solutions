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

    public static void main(String[] args) {

//        int[] a = {7, 4, 9, 6};
//        marcsCakewalk(a);

        int[] b = {1, 3, 2};
        marcsCakewalk(b);

    }

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Arrays.sort(calorie);
        long total = 0;

        for (int i = calorie.length - 1; i >= 0; i--) {
            total += (long)Math.pow(2, calorie.length - i - 1) * calorie[i];
        }

        return total;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> calorie = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}