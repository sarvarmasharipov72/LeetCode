package Arrays;

import utils.TreeNode;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return binaryTree(0, nums.length - 1, nums);
    }
    public TreeNode binaryTree(int startIndex, int endIndex, int[] nums){
       if (startIndex > endIndex ) return null;
        int m = (startIndex + endIndex) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = binaryTree(startIndex, m-1, nums);
        node.right = binaryTree(m + 1, endIndex, nums);
        return node;
    }
}
