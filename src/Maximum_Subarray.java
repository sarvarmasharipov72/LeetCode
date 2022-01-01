public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int maxInt = nums[0];
        if (nums.length == 1){
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++){
            maxSub = Math.max(nums[i], nums[i] + maxSub );
            maxInt = Math.max(maxInt, maxSub);
        }
        return maxInt;
    }
}
