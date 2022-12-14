package advanced.java_visitor_pattern;

import java.awt.*;
import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static Tree solve() {
//        Scanner scan = new Scanner(System.in);
//        Integer n = new Integer(scan.nextLine());
//        List<Integer> values = Arrays.asList(scan.nextLine().split(" ")).stream().map(Integer::new).collect(Collectors.toList());
//        List<Integer> colors = Arrays.asList(scan.nextLine().split(" ")).stream().map(Integer::new).collect(Collectors.toList());
//        TreeNode root = new TreeNode(values.get(0), Color.values()[colors.get(0)], 0);
//
//
//        for (int i = 0; i < n - 1; i++) {
//            int u = scan.nextInt();
//            int v = scan.nextInt();
//            Tree tree;
//
//            if (v % 2 == 0) {
//                tree = new TreeLeaf();
//                root.addChild(new TreeLeaf(values.get(i), Color.values()[colors.get(i)], i / 2));
//                System.out.println("leaf");
////                root.addChild(new TreeLeaf(values.get(x)));
//            } else {
//                for () {
//
//                }
//                System.out.println("node");
////                root.addChild(new TreeNode());
//            }
//        }

        return null;
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}