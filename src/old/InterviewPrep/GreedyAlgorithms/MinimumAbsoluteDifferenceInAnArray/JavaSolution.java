package InterviewPrep.GreedyAlgorithms.MinimumAbsoluteDifferenceInAnArray;

public class JavaSolution {

    public static void main(String[] args) {
        int[] ar = {3, -7, 0};

        System.out.println(minimumAbsoluteDifference(ar));
    }

    static int minimumAbsoluteDifference(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < min) {
                    min = Math.abs(arr[i] - arr[j]);
                }
            }
        }

        return min;

    }

}
