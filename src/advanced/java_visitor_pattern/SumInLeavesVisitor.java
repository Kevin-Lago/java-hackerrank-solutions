package advanced.java_visitor_pattern;

class SumInLeavesVisitor extends TreeVis {
    Integer result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

