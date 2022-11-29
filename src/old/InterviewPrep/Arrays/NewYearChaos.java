package InterviewPrep.Arrays;

public class NewYearChaos {

    public static void main(String[] args) {

//        int[] q = {5, 1, 2, 3, 7, 8, 6, 4};
//        minimumBribes(q);

//        int[] q1 = {1, 2, 5, 3, 4, 7, 8, 6};
//        minimumBribes(q1);

        int[] a2 = {2, 1, 5, 3, 4};
        minimumBribes(a2);

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
