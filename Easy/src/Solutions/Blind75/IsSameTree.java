package Solutions.Blind75;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
    }

    private boolean same(TreeNode a, TreeNode b) {
        if ((a == null && b != null) || (a != null && b == null)) {
            return false;
        }

        if (a == null && b == null) {
            return true;
        }

        boolean isLeftSame = false;
        boolean isRightSame = false;

        if (a.val == b.val) {
            isLeftSame = same(a.left, b.left);
            isRightSame = same(a.right, b.right);
        }

        return isLeftSame && isRightSame;
    }
}
