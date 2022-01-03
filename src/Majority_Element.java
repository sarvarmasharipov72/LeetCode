import java.util.Arrays;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
//        Accepted time 6ms and memory 54.8
        int count = 0, maxCount = 0, index = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] == nums[i]) count++;
            else if (count > maxCount){
                index = i - 1;
                maxCount = count;
                count = 0;
            }
            else count = 0;
        }
        if (maxCount < count){
            index = nums.length - 1;
        }
        return nums[index];

//        Time Limit Exceeded
//        int maxCount = 0, index = 0;
//        for (int i = 0; i < nums.length;i++){
//            int count = 0;
//            for (int j = i + 1; j < nums.length; j++){
//                if (nums[i] == nums[j]){
//                    count++;
//                }
//            }
//            if (count > maxCount){
//                index = i;
//                maxCount = count;
//            }
//        }
//        return nums[index];
    }

    public static void main(String[] args) {
        majorityElement(new int[]{2,2,1,1,1,2,2});
    }
}
