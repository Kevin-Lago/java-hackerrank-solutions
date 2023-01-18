package vanilla_java.problem_solving.data_structures.arrays.two_dimensional_array_data_structure;

public class HourGlassSum {

    public static void main(String[] args) {

//        int[][] arr = {
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        };
//
//        if (hourglassSum(arr) == 19) {
//            System.out.println("Test case 0 passed");
//        } else {
//            System.out.println("Test cast 0 failed");
//        }

        int[][] arr4 = {
                {-1, 1, -1, 0, 0, 0},
                {0, -1, 0, 0, 0, 0},
                {-1, -1, -1, 0, 0, 0},
                {0, -9, 2, -4, -4, 0},
                {-7, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };

        if (hourglassSum(arr4) == 0) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test cast 2 failed: " + hourglassSum(arr4));
        }

    }

    public static int hourglassSum(int[][] arr) {

        int sum = arr[0][0] +
                arr[0][1] +
                arr[0][2] +
                arr[1][1] +
                arr[2][0] +
                arr[2][1] +
                arr[2][2];

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                int currentSum =
                    arr[i][j] +
                    arr[i][j + 1] +
                    arr[i][j + 2] +
                    arr[i + 1][j + 1] +
                    arr[i + 2][j] +
                    arr[i + 2][j + 1] +
                    arr[i + 2][j + 2];
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
        }

        return sum;

    }

}
