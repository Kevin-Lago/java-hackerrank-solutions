package vanilla_java.advanced.java_singleton_pattern;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchMethodException {
        Scanner scan = new Scanner(System.in);

        Singleton singleton1 = Singleton.getSingleInstance();
        singleton1.str = scan.next();
        Singleton singleton2 = Singleton.getSingleInstance();

        // contains public String field str

        // getSingleInstance returns that single instance

        // contains single private constructor
        if (Singleton.class.getDeclaredConstructor().isAccessible()) {
            System.out.println("wrong class!");
        }

        System.out.println("Hello I am a singleton! Let me say " + singleton1.str + " to you");
    }

}
