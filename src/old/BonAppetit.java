import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {

        List<Integer> i = new ArrayList<>();
        i.add(3); i.add(10); i.add(2); i.add(9);

        bonAppetit(i, 1, 7);
        bonAppetit(i, 1, 12);

    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int total = 0;

        for (Integer price : bill) {
            if (price != bill.get(k)) total += price;
        }

        if (b == total / 2) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(Math.abs(b - (total / 2)));
        }

    }

}
