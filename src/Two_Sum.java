import java.sql.Array;

public class Two_Sum {
    public static void main(String[] args) {
        twoSum(new int[]{-1,-2,-3,-4,-5},-8);
    }
    public static int[] twoSum(int[] nums, int target) {
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
