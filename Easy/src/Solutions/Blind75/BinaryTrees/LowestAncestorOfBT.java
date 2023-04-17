package Solutions.Blind75.BinaryTrees;

import Solutions.Blind75.BinaryTrees.TreeNode;

public class LowestAncestorOfBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //决定性条件是root==p || root==q
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //如果两边都能找到ancestor说明一个在左半区一个在右半区，直接返回root
        if (left != null && right != null) return root;
        //剩下的情况就是都在一个半区，所以直接返回该半区dfs的结果
        return left != null ? left : right;
    }
}
