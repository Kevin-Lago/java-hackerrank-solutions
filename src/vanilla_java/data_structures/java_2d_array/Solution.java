package vanilla_java.data_structures.java_2d_array;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int largestSum = Integer.MIN_VALUE;

        for (int c = 0; c <= 3; c++) {
            for (int r = 0; r <= 3; r++) {
                int sum = 0;

                sum += arr.get(r).get(c) + arr.get(r).get(c + 1) + arr.get(r).get(c + 2);
                sum += arr.get(r + 1).get(c + 1);
                sum += arr.get(r + 2).get(c) + arr.get(r + 2).get(c + 1) + arr.get(r + 2).get(c + 2);

                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }

        System.out.println(largestSum);
        bufferedReader.close();
    }
}
