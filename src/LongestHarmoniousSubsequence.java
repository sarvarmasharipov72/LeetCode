import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : map.keySet()) {
            if (map.containsKey(n + 1)) {
                max = Math.max(max, map.get(n) + map.get(n + 1));
            }
        }
        return max;
    }
}
//Wrong Answear
//int maxArray = 0;
//        int subMax = 0;
//        Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] - nums[i -1] < 2) {
//                 maxArray++;
//             }
//             subMax = Math.max(maxArray, subMax);
//         }