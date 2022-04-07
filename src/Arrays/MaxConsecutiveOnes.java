package Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sub_max = 0;
        for (int num : nums) {
            if (num == 0) {
                sub_max = 0;
            }
            sub_max++;
            max = Math.max(sub_max, max);

        }
        return max;
    }
}
