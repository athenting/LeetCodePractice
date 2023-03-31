package Solutions.Blind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class LowestAncestor {

    // Definition for a binary tree node
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode Right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 1.
     */
    public TreeNode findCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Deque<TreeNode> ancestors = new ArrayDeque<>();
        if (p == root.Right) {
            ancestors.add(root);
            findCommonAncestor(root.left,p,q);
        }


        return findCommonAncestor(root.left, p, q);
    }

    //entrance
    private TreeNode findLowest(TreeNode root, TreeNode p, TreeNode q) {


        return findCommonAncestor(root, p, q);

    }

}
