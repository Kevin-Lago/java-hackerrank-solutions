import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String n = "2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982";
            BigInteger num = new BigInteger(n);

            System.out.println(num.isProbablePrime(1));

            bufferedReader.close();

            if (num.equals(1)) {
                System.out.println("not prime");
                return;
            }

            for (int i = 2; num.divide(BigInteger.valueOf(2)).equals(i); i++) {
                if (num.mod(BigInteger.valueOf(i)).equals(0)) {
                    System.out.println("not prime");
                    return;
                }
            }

            System.out.println("prime");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
