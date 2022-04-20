package Tree;

import utils.TreeNode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0) {
            return ++right;
        }
        if (right == 0) {
            return ++left;
        }
        return Math.min(left, right) + 1;
    }
}
