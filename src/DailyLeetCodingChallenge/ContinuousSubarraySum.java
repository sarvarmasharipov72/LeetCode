package DailyLeetCodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> list = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!list.containsKey(sum % k)) {
                list.put(sum % k, i +1);
            }
            else if (list.get(sum % k) < i) {
                return true;
            }
        }
        return false;
    }
}
