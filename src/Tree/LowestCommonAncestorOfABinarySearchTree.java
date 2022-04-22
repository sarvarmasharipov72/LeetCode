package Tree;

import utils.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    TreeNode treeNode;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowestAncestor(root, p, q);
        return treeNode;
    }
    public boolean lowestAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        if (root.val == p.val || root.val == q.val) {
            treeNode = root;
            return true;
        }
        boolean left = lowestAncestor(root.left, p, q);
        boolean right = lowestAncestor(root.right, p, q);


        if (left && right) {
            treeNode = root;
            return false;
        }
        if ((left || right) && (q.val == root.val || p.val == root.val)){
            treeNode = root;
            return false;
        }
        return left || right;
    }
}
