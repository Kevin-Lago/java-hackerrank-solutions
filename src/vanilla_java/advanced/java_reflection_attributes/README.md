| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_varargs_simple_addition)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/can_you_access)</img> |
|:---|:---:|---:|

# Java Reflection - Attributes

Java reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that it prints all the methods of another class called Student in alphabetical order. We will append your code with the Student class before running it. The Student class looks like this:

```java
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
    some more methods
    ......
}
```

You have to print all the methods of the student class in alphabetical order like this:

```
anothermethod
getName
setEmail
setId
......
......
some more methods
......
```

There is no sample input/output for this problem. If you press "Run Code", it will compile it, but it won't show any outputs/

__Hint:__ See the oracle docs for more details about [Java Reflection Methods and Fields](https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html)

---

<details><summary>Solution</summary>
    
```java
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
```
</details>
