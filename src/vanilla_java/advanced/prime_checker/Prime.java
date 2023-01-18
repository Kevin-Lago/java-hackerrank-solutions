package vanilla_java.advanced.prime_checker;

import java.util.ArrayList;
import java.util.List;

class Prime {

    public void checkPrime(int ...n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {
            boolean isPrime = n[i] == 1 ? false : true;

            for (int j = 2; j <= n[i] / 2; j++) {
                if (n[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(n[i]);
            }
        }

        primes.forEach(prime -> System.out.print(prime + " "));
        System.out.println();
    }

}
