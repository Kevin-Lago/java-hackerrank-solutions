public class FormingAMagicSquare {

    public static void main(String[] args) {

        int[][] s = {
                {4, 8, 2},
                {4, 5, 7},
                {6, 1, 6}
        };
        System.out.println(formingMagicSquare(s));

        int[][] s1 = {
                {4, 5, 8}, // 2 // 17
                {2, 4, 1}, // 8 // 7
                {1, 9, 7}  // 2 // 17
        }; //    8  3  1 / 0
        System.out.println(formingMagicSquare(s1));

    }

    // TODO UNFINISHED PROBLEM

    static int formingMagicSquare(int[][] s) {

        int n = s.length;
        int m = n * n;
        int magicSum = (n * (m + 1)) / 2;
        int magicTotal = magicSum * (m - 1);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += s[i][j] + s[j][i];
            }
            sum += s[i][i] + s[i][n - 1 - i];
        }

        int cost = sum - magicTotal;
        return Math.abs(cost);

    }

    static void generateSquare(int n) {
        int[][] magicSquare = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) //3rd condition
            {
                j = n - 2;
                i = 0;
            } else {
                //1st condition helper if next number
                // goes to out of square's right side
                if (j == n)
                    j = 0;

                //1st condition helper if next number is
                // goes to out of square's upper side
                if (i < 0)
                    i = n - 1;
            }

            //2nd condition
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                //set number
                magicSquare[i][j] = num++;

            //1st condition
            j++;
            i--;
        }

        // print magic square
        System.out.println("The Magic Square for " + n + ":");
        System.out.println("Sum of each row or column " + n * (n * n + 1) / 2 + ":");
    }


    }
