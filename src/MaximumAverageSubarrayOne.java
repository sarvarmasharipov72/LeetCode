public class MaximumAverageSubarrayOne {
    public double findMaxAverage(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        int max = nums[k - 1];
        for (int i = k; i < nums.length; i++) {
            max = Math.max(max, nums[i] - nums[i - k]);
        }

        return max * 1.0 / k;
    }
}
