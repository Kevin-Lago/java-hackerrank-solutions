| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_annotations)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_lambda_expressions)</img> |
|:---|:---:|---:|

# Covariant Return Types

Java allows for [Covariant Return Types](), which means you can vary your return type as long as you are returning as subclass of your specified return type.

[Method Overriding]() allows a subclass to override the behavior of an existing super class method and specify a return type that is some subclass of the original return type. It is best practice to use the ```@Override``` [annotation]() when overriding a superclass method.

Implement the classes and methods detailed in the diagram below:

![HackerrankdCovariantReturnTypesDiagram](1.png)

You will be given partially completed code in the editor where the main method takes the name of a state (i.e., ```WestBengal```, or ```AndhraPradesh```) and prints the national flower of that state using the classes and methods written by you.

__Note:__ Do not use access modifiers in your class declarations

__Resources__

[Covariant Return Type]()

[Java Covariant Type]()

__Input Format__

The locked code reads a single string denoting the name of a subclass of State (i.e., ```WestBengal``` or ```AndhraPradesh```), then tests the methods associated with that subclass. You are not responsible for reading any input from stdin.

__Output Format__

Output is handled for you by the locked code, which creates the object corresponding to the input string's class name and then prints the name returned by that class' national flower's whatYourName method. You are not responsible for printing anything to stdout.

__Sample Input__

```
AndhraPradesh
```

__Sample Output__

```
Lily
```

__Explanation__

An AndraPradesh object's yourNationalFlower method returns an instance of the Lily class, and the Lily class' whatsYourName method returns Lily, which is printed by the hidden code checker.

---

<details><summary>Solution</summary>
    
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
    String whatsYourName() {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}


public class Solution {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
```
</details>