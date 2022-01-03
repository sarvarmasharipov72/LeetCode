import java.util.HashMap;
import java.util.Map;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (list.containsKey(nums[i]))
                list.remove(nums[i]);
            else
            list.put(nums[i], i);
        }
        for (Map.Entry<Integer,Integer> key: list.entrySet())
        return key.getKey();
//        Arrays.sort(nums);
//        int cnt = 0, index = 0;
//        for (int i = 1; i < nums.length; i++){
//            if ()
//        }
//        return 1;
//        int res = nums[0];
//        for (int i = 1; i < nums.length; i++)
//            res = res ^ nums[i];
//
//        return res;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,4,3,1,2,3,3}));
    }
}
