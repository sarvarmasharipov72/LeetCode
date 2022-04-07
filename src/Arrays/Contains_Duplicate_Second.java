package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_Second {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int pre = map.get(nums[i]);
                if (k >= i - pre) return true;
                map.put(nums[i], i);
            } else map.put(nums[i], i);
        }
        return false;
//        Time Limit Exceeded
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
//                if (nums[i] == nums[j] && j-i <= k) return true;
//            }
//        }
//        return false;
    }
}
