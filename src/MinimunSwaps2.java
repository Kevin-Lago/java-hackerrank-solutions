public class MinimunSwaps2 {

    public static void main(String[] args) {

//        int[] arr = {4, 3, 1, 2};
//        minimumSwaps(arr);
//
//        int[] arr1 = {2, 3, 4, 1, 5};
//        minimumSwaps(arr1);
//
//        int[] arr2 = {1, 3, 5, 2, 4, 6, 7};
//        minimumSwaps(arr2);

        int[] arr3 = {1, 3, 5, 2, 4, 6, 9, 8, 11, 14, 10, 12, 13, 7};
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; //
        minimumSwaps(arr3);

        int[] arr4 = {2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19};
        minimumSwaps(arr4);

    }

    static int minimumSwaps(int[] arr) {

        int swaps = 0;
        int max = arr.length;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != max) {
                swaps++;
                for (int j = 0; j < max; j++) {
                    if (arr[j] == max) {
                        arr[j] = arr[i];
                        break;
                    }
                }
                arr[max - 1] = max;
                max--;
                i = max;
            } else if (arr[i] == max) {
                max--;
            }
        }

        System.out.println(swaps);
        return swaps;

    }

    static int minimumSwap(int[] arr) {

        int max = arr.length;
        int outOfPlace = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != max) {
                outOfPlace++;
                max--;
            } else if (arr[i] == max) {
                max--;
            }
        }

        System.out.println(outOfPlace - 1);
        return outOfPlace - 1;

    }

}
