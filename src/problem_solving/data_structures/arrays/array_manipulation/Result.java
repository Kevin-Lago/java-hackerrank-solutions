package problem_solving.data_structures.arrays.array_manipulation;

public class Result {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };

        int[][] b = {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };

//        System.out.println(arrayManipulation(3, a));
        System.out.println(arrayManipulation(10, b));
        // {0, 2, 0, 2, 0, 0, 0, 0}
    }

    static long arrayManipulation(int n, int[][] queries) {
        long max = 0L;
        long[] arr = new long[n];

        for (int i = 0; i < queries.length; i++) {
            arr[queries[i][0] - 1] += queries[i][2];
            arr[queries[i][1]] -= queries[i][2];
        }

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, max + arr[i]);
        }

        return max;
    }

}
