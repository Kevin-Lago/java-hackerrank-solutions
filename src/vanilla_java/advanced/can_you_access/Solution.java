package vanilla_java.advanced.can_you_access;

import java.io.*;
import java.lang.reflect.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            o = new Inner().new Private();

            Method method = o.getClass().getDeclaredMethod("powerof2", int.class);
            method.setAccessible(true);

            System.out.println(num + " is " + method.invoke(o, num));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }

}
