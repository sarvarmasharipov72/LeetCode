import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[] {1, 1});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> list = new HashSet<>();
        for (int i : nums) {
            list.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!list.contains(i)) {
                result.add(i);
            }
        }

        return result;

//        Time Limit Exceeded
//        for (int i = 1; i <= nums.length; i++) {
//             Boolean bool = false;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] == i) {
//                    bool = true;
//                }
//            }
//            if (!bool) {
//                result.add(i);
//            }
//        }

//        Eror
//        var list = new ArrayList<Integer>();
//        Arrays.sort(nums);
//        int j = 0;
//        for (int i = 1; i < nums[nums.length - 1]; i++) {
//            if (nums[j] - i == -1) {
//                continue;
//            }
//        }
//
//        if (list.size() == 0) {
//            list.add(nums[nums.length - 1] + 1);
//        }
//        return list;
    }
}
