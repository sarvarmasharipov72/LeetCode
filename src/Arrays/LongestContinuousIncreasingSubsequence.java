package Arrays;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int subMax = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                subMax++;
            } else {
                subMax = 1;
            }
            max = Math.max(subMax, max);
        }
        return max;
    }
}
