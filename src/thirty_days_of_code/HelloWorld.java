package thirty_days_of_code;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(input);

        scan.close();
    }

}
