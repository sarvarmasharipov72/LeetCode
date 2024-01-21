package DailyLeetCodingChallenge;

import java.util.*;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = nums.length/3;
        for (int i : nums) {
               map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> majorityElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > cnt) {
                majorityElements.add(i.getKey());
            }
        }
        return majorityElements;
    }
}
