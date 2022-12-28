package data_structures.java_dequeue;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> unique = new HashSet();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            deque.add(num);
            unique.add(num);

            if (deque.size() == m) {
                if (unique.size() > max) {
                    max = unique.size();
                }
                int first = deque.removeFirst();
                if (!deque.contains(first)) {
                    unique.remove(first);
                }
            }
        }

//        long max = deque.stream().limit(m).distinct().count();
//
//        for (int i = 0; i < deque.size() - m; i++) {
//            long unique = deque.stream().limit(m).distinct().count();
//
//            if (unique > max) {
//                max = unique;
//            }
//
//            deque.removeFirst();
//        }

        System.out.println(max);
    }

}
