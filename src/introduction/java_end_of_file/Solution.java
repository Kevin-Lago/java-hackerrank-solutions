package introduction.java_end_of_file;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 0;

        while (scanner.hasNext()) {
            line++;
            System.out.println(line + " " + scanner.nextLine());
        }

        scanner.close();
    }

}
