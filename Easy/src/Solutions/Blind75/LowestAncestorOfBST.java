package Solutions.Blind75;

public class LowestAncestorOfBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        } else {
            //它是一个二叉搜索树，所以本质是做一个二叉查找
            if (root.val == p.val || root.val == q.val) {
                return root;
            }
            if (root.val > p.val && root.val > q.val) {
                return lowestCommonAncestor(root.left, p, q);
            }
            if (root.val < p.val && root.val < q.val) {
                return lowestCommonAncestor(root.right, p, q);
            }
            return root;
        }
    }

}
