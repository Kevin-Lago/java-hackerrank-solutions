# Java Currency Formatter

Given a [double-precision](https://en.wikipedia.org/wiki/Double-precision_floating-point_format) number, _payment_, denoting an amount of money, use the [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) class' [getCurrencyInstance](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-) method to conver _payment_ into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

```
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
```

where _formattedPayment_ is _payment_ formatted accoding to the appropriate [Locale](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html) currency.

__Note:__ India does not have a built-in Locale, so you must [construct one](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-) where the language is __en__ (i.e., English).

__Input Format__

A single double-precision number denoting _payment_

__Constraints__

 - 0 <= _payment_ <= 10^9
 
__Output Format__

On the first line, print ```US: u``` where _u_ is _payment_ formatted for US currency.

On the second line, print ```India: i``` where _i_ is _payment_ formatted for Indian currency.

On the third line, print ```China: c``` where _c_ is _payment_ formatted for Chinese currency.

On the fourth line, print ```France: f``` where _f_ is _payment_ formatted for French currency.

__Sample Input__

```
12324.134
```

__Sample Output__

```
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
```

__Explanation__

Each line contains the value _payment_ formatted according to the four countries' respective currencies. 

__Solution__

```java
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
```