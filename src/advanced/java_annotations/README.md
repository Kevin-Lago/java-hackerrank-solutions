| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/advanced/java_singleton_pattern)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/advanced/covariant_return_types)</img> |
|:---|:---:|---:|

# Java Annotations

Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to instruct the compiler about the build process. Annotation is also used at runtime to get insight into the properties of class elements.

Java annotation can be added to an element in the following way:

```java
@Entity
Class DemoClass {

}
```

We can also set a value to the annotation member. For example:

```java
@Entity(EntityName = "DemoClass)
Class DemoClass {
}
```

In Java, There are several built-in annotations. You can also define your own annotations in the following way:

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
}
```

Here, we define an annotation __FamilyBudget__, where __userRole__ is the only member in that custom annotation. The __userRole__ takes only __String type values, and the default is __"GUEST"__. If we do not define the value for this annotation member, then it takes the default. By using @Target, we can specify where our annotation can be used. For example, the __FamilyBudget__ annotation can only be used with the method in a class. @Retention defines whether the annotation is available at runtime. To learn more about Java annotations, you can read the [tutorial]() and [oracle docs]().

Take a look at the following code segment:

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
}

class FamilyMember {
	@FamilyBudget(userRole = "SENIOR")
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "JUNIOR")
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method
                                .getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = role.equals("SENIOR") ? 100 : 50;
                        if (userRole.equals(role)) {
                            if(spend <= budgetLimit){
                                method.invoke(FamilyMember.class.newInstance(),
                                        budgetLimit, spend);
                            }else{
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}
```

Here, we partially define an annotation, __FamilyBudget__ and a class, __FamilyMember__. In this problem, we give the user role and the amount of money that a user spends as inputs. Based on the user role, you have to call the appropriate method in the __FamilyMember__ class. If the amount of money spent is over the budget limit for that user role, it prints ```Budget Limit Over```.

You task is to complete the __FamilyBudget__ annotation and the __FamilyMember__ class so that the __Solution__ class works perfectly with the defined constratins.

__Note:__ You must complete the __5__ incomplete lines in the editor. You are not allowed to change, delete or modify any other lines. To restore the original code, click on the top-left button on the editor and create a new buffer.

__Input Format__

The first line of input contains an integer ___n___ representing the total number of test cases. Each test case contains a string and an integer separated by a space on a single line in the following format:

```
UserRole MoneySpend
```

__Constraints__

- $2 \le n \le 10$

- $0 \le MoneySpend \le 200$

- $|UserRole| = 6$

Name contains only lowercase English letters.

__Output Format__

Based on the user role and budget outputs, output the contents of the certain method. If the amount of money spent is over the budget limit, the noutput ```Budget Limit Over```.

__Sample Input__

```
3
SENIOR 75
JUNIOR 45
SENIOR 40
```

__Sample Output__

```
Senior Member
Spend: 75
Budget Left: 25
Junior Member
Spend: 45
Budget Left: 5
Senior Member
Spend: 40
Budget Left: 60
```

---

<details><summary>Solution</summary>
    
```java

```
</details>