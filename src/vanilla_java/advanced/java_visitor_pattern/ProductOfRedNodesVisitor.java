package vanilla_java.advanced.java_visitor_pattern;

class ProductOfRedNodesVisitor extends TreeVis {
    Integer sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor().equals("red")) {
            sum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}
