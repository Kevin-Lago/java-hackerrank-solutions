package advanced.java_lambda_expressions;

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static boolean isOdd(int num) {
        return num % 2 == 0;
    }


}
