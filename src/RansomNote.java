import java.util.Scanner;

public class RansomNote {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

    static void checkMagazine(String[] magazine, String[] note) {

        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < magazine.length; j++) {
                if (note[i].equals(magazine[j])) {
                    magazine[j] = "";
                    if (i == note.length - 1) {
                        System.out.println("Yes");
                        return;
                    }
                    break;
                }
                if (j == magazine.length - 1) {
                    System.out.println("No");
                    return;
                }
            }
        }

    }

}
