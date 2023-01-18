| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.object_oriented_programming/java_interface)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.object_oriented_programming/java_method_overriding_2_super_keyword)</img> |
|:---|:---:|---:|

# Java Method Overriding

When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:

```java
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
```

First, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a different, subclass-specific string:

```java
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
```

__Note:__ When overriding a method, you should precede it with the ```@override``` annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.

---

__Task__

Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as teh superclass' getNumberOfTeamMembers method, except that it replaces ___n___ with __11__ (the number of players on a Soccer team).

__Output Format__

When executed, your computed code should print the following:

```
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
```

---

<details><summary>Solution</summary>
    
```java

```
</details>