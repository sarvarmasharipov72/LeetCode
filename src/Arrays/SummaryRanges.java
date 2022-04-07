package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        list1.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                list1.add(nums[i]);
            } else if (list1.size() == 1) {
                list.add(String.valueOf(list1.get(0)));
                list1.clear();
                list1.add(nums[i]);
            } else {
                list.add(list1.get(0) + "->" + list1.get(list1.size() - 1));
                list1.clear();
                list1.add(nums[i]);
            }
        }
        if (list1.size() == 1) {
            list.add(String.valueOf(list1.get(0)));
            list1.clear();
        } else {
            list.add(list1.get(0) + "->" + list1.get(list1.size() - 1));
            list1.clear();
        }
        return list;
    }
}
