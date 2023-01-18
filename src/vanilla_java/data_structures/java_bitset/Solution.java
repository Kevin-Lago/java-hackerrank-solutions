package vanilla_java.data_structures.java_bitset;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();

        BitSet[] bs = new BitSet[2];
        bs[0] = b1;
        bs[1] = b2;

        for (int i = 0; i < m; i++) {
            String o = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (o.equals("AND")) {
                bs[x - 1].and(bs[y - 1]);
            } else if (o.equals("OR")) {
                bs[x - 1].or(bs[y - 1]);
            } else if (o.equals("XOR")) {
                bs[x - 1].xor(bs[y - 1]);
            } else if (o.equals("FLIP")) {
                bs[x - 1].flip(y);
            } else if (o.equals("SET")) {
                bs[x - 1].set(y);
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }

}
