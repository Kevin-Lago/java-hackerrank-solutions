package vanilla_java.advanced.java_lambda_expressions;

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return num -> {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return num -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(num);

            return Integer.parseInt(stringBuilder.reverse().toString()) == num;
        };
    }

}
