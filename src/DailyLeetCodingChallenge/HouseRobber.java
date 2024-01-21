package DailyLeetCodingChallenge;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int result = 0;
        int d = nums[0];
        int one = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result = Math.max(d + nums[i], one);
            d = one;
            one = result;
        }
        return result;
    }
}
