package vanilla_java.data_structures.java_stack;

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
