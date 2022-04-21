package Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postOrder(root, arr);
        return arr;
    }

    private void postOrder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        postOrder(root.left, arr);
        postOrder(root.right, arr);
        arr.add(root.val);
    }
}
