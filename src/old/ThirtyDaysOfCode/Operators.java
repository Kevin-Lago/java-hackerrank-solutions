package ThirtyDaysOfCode;

public class Operators {

    public static void main(String[] args) {

        solve(12.00d, 20, 8);

    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * ((double)tip_percent / 100);
        double tax = meal_cost * ((double)tax_percent / 100);

        System.out.println(Math.round(meal_cost + tip + tax));

    }

}
