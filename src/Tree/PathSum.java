package Tree;

import utils.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }
        return  hasPathSum(root.right, targetSum - root.val) || hasPathSum(root.left, targetSum - root.val);
    }

//    public int hasSum(TreeNode root, int targetSum, int sum) {
//        if (root == null) {
//            return (sum == targetSum)? targetSum : targetSum + 1;
//        }
//        sum += root.val;
//        int left = hasSum(root.left, targetSum, sum);
//        int right = hasSum(root.right, targetSum, sum);
//        if (left == targetSum || right == targetSum) {
//            return targetSum;
//        }
//        return targetSum + 1;
//    }
}
