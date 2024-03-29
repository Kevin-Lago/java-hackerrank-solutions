package vanilla_java.data_structures.java_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();

            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();

            System.out.println(phoneBook.get(s) != null ? s + "=" + phoneBook.get(s) : "Not found");
        }
    }

}
