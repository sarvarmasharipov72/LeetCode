package Tree;

import utils.TreeNode;

import java.util.HashMap;

public class FindModeInBinarySearchTree {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        find(root);
        if (map.size() == 0) return new int[] {0};
        int[] mode = new int[map.size()];
        int k = 0;
        for (Integer i : map.keySet()) {
            mode[k++] = i;
        }
        return mode;
    }
    public void find(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.val == root.left.val || root.right != null && root.right.val == root.val) {
                map.put(root.val, 1);
            }
            find(root.left);
            find(root.right);
        }

    }
}
