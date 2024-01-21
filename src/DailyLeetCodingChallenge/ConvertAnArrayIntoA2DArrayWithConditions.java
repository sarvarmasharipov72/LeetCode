package DailyLeetCodingChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> index = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> n = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (!index.contains(j) && !n.contains(nums[j])) {
                    n.add(nums[j]);
                    index.add(j);
                }
            }
            if (n.isEmpty()) break;
            result.add(n);
        }
        return result;
    }
}
