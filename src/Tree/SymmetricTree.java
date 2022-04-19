package Tree;

import utils.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric2(root.left, root.right);
    }
    public boolean isSymmetric2(TreeNode q, TreeNode p) {
        if (q == null && p == null) return true;
        if (q == null || p == null) return false;
        return q.val == p.val && isSymmetric2(q.left, p.right) && isSymmetric2(q.right, p.left);
    }
}
