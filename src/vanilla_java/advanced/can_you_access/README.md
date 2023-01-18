| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_reflection_attributes)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/prime_checker)</img> |
|:---|:---:|---:|

# Can You Access?

You are given a class Solution and an inner class Inner, Private. The main method of class Solution takes an integer ___num___ as input. The powerof2 in class Inner. PRivate checks whether a number is a power of __2__. You have to call the method powerof2 of the calss Inner.Private from the main method of class Solution.

__Constraints__

- $1 \le num \le 2^30$

__Sample Input__

```
8
```

__Sample Output__

```
8 is power of 2
An instance of class: Solution.Inner.Private has been created
```

---

<details><summary>Solution</summary>
    
```java
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
```
</details>