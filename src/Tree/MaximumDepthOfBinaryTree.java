package Tree;

import utils.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int i = maxDepth(root.left);
        int j = maxDepth(root.right);

        if (i > j) {
            i++;
            return i;
        }
        j++;
        return j;
    }
}
