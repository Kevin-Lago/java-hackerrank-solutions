| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Stacks

> In computer science, a stack is an abstract data type that serves as a collection of elements, with two main operations:
>
> - Push, which adds an element to the collection, and
> - Pop, which removes the most recently added element that was not yet removed.
> [Wikiepedia](https://en.wikipedia.org/wiki/Stack_(abstract_data_type))

A string containing only parentheses is balanced if the following is true:

1. If it is an empty string

2. If A and B are correct, AB is correct, 3. If A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced java.strings are: "{}()", "[{()}]", "({[]})"

Examples of some unbalanced java.strings are: "{}(", "({)}", "[[", "}{" ect.

Given a string, determine if it is balanced or not.

__Input Format__

There will be multiple lines in the input file, each ahving a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

__Output Format__

For each case, print 'true' if the string is balanced, 'false' otherwise.

__Sample Input__

```
{}()
({()})
{}(
[]
```

__Sample Output__

```
true
true
false
true
```

---

<details><summary>Solution</summary>
    
```java
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String string = scan.next();
            Stack s = new Stack();

            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);

                if (s.empty()) {
                    if (c == ')' || c == '}' || c == ']') {
                        s.push(c);
                        break;
                    }
                }
                
                if (c == '(' || c == '{' || c == '[') {
                    s.push(c);
                } else if (c == ')' && (char) s.peek() == '(' || c == '}' && (char) s.peek() == '{' || c == ']' && (char) s.peek() == '[') {
                    s.pop();
                }
            }

            System.out.println(s.empty());
            s.clear();
        }
    }

}
```
</details>