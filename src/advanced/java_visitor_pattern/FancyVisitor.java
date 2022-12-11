package advanced.java_visitor_pattern;

class FancyVisitor extends TreeVis {
    Integer result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            result += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getDepth() % 2 != 0) {
            result += leaf.getValue();
        }
    }
}