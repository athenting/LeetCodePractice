package Solutions.Blind75.BinaryTrees;

import Solutions.Blind75.BinaryTrees.TreeNode;

public class HeightBalanced {

    public boolean isBalanced(TreeNode root) {

        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode root){
        if(root == null)
            return 0;

        int lh = maxDepth(root.left);
        if(lh == -1)
            return -1;

        int rh = maxDepth(root.right);
        if(rh == -1)
            return -1;

        if(Math.abs(lh - rh) > 1)
            return -1;

        return 1+Math.max(lh, rh);
    }
}

