package Solutions.Blind75.BinaryTrees;

import Solutions.Blind75.BinaryTrees.TreeNode;

public class MaxDepth {
    //基于递归的分治法，将左右两边拆分，然后找出两者的更大的值，+1（根节点自己也算一个节点）
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return calculateDepth(root);
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
