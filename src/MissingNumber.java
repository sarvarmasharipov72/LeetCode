public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sumN = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int it: nums){
            sum += it;
        }
        return sumN - sum;
//        Accepted
//        Arrays.sort(nums);
//        if (nums.length == 0) {
//            if (nums[0] == 0) {
//                return 1;
//            } else {
//                return 1;
//            }
//        }
//        if (nums[0] != 0) {
//            return 0;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i - 1] > 1) {
//                return nums[i] - 1;
//            }
//        }
//        if (nums[0] != 0) {
//            return 0;
//        }
//        return nums[nums.length - 1] + 1;
    }
}
