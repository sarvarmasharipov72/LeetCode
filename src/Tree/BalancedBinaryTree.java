package Tree;

import utils.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return maxDepth(root) != -1;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int i = maxDepth(root.left);
        int j = maxDepth(root.right);
        if (i == -1 || j == -1) {
            return -1;
        }
        if (Math.abs(i - j) > 1) {
            return -1;
        }
        return Math.max(i, j) + 1;
    }
}
