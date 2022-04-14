package BinarySearch;

import utils.TreeNode;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (val == root.val) {
            return root;
        }
        if (val > root.val && root.left != null) return searchBST(root.left, val);
        else if (val < root.val && root.right != null) return searchBST(root.right, val);

        return new TreeNode();
    }
}
