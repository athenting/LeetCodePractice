package Solutions.Blind75;

public class IsValidBTS {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        }
        if (node.val <= minVal || node.val >= maxVal) {
            return false;
        }
        return isValidBST(node.left, minVal, node.val) && isValidBST(node.right, node.val, maxVal);
    }
}