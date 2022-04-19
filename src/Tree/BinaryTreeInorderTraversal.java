package Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }

    public void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root != null) {
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);

        }
    }
    
}
