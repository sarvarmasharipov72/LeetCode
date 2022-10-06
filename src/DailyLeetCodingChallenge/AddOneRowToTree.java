package DailyLeetCodingChallenge;

import utils.TreeNode;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return checkDepth(root, val, depth, 2);
    }

    private TreeNode checkDepth(TreeNode root, int val, int depth, int countDepth) {
        if (depth == 1) {
            TreeNode treeNode = new TreeNode(val);
            treeNode.left = root;
            return treeNode;
        } else if (depth == countDepth) {
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);
            if (root.left != null) {
                left.left = root.left;
            }
            if (root.right != null) {
                right.right  = root.right;
            }
            root.right = right;
            root.left = left;
            return root;
        }
        checkDepth(root.left, val, depth, countDepth + 1);
        checkDepth(root.right, val, depth, countDepth + 1);
        return null;
    }
}
