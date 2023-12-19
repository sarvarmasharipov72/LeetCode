package DailyLeetCodingChallenge;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[0] * nums[1]) - (nums[nums.length - 1] * nums[nums.length - 2]);
    }
}
