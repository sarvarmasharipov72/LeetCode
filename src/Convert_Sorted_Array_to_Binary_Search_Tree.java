import utils.TreeNode;

import java.util.Arrays;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return binaryTree(0, nums.length - 1, nums);
    }
    public static TreeNode binaryTree(int startIndex, int endIndex, int[] nums){
       if (startIndex > endIndex ) return null;
        int m = (startIndex + endIndex) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = binaryTree(startIndex, m-1, nums);
        node.right = binaryTree(m + 1, endIndex, nums);
        return node;
    }
    public static void main(String[] args) {
        sortedArrayToBST(new int[]{1,3,2,6,5,4,0});
    }
}
