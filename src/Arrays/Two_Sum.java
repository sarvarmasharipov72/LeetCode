package Arrays;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= target && target >= 0) continue;
            if (nums[i] <= target && target < 0) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
            return new int[]{1, 2};
    }
}
