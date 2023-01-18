package vanilla_java.introduction.java_currency_formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale inLocal = new Locale("en", "IN");
        NumberFormat inCurrencyFormatter = NumberFormat.getCurrencyInstance(inLocal);

        String us = usCurrencyFormatter.format(payment);
        String india = inCurrencyFormatter.format(payment);
        String china = cnCurrencyFormatter.format(payment);
        String france = frCurrencyFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
