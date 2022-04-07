package Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int k = 0; k < nums.length; k++){
            if (nums[k] == 0){
                continue;
            }
            nums[i++] = nums[k];
        }
        for (int j = i; j < nums.length; j++){
            nums[j] = 0;
        }
//        very slow
//        int k = nums.length;
//        for (int i = 0; i < k; i++) {
//            if (nums[i] == 0) {
//                for (int j = i + 1; j < k; j++) {
//                    int temp = nums[j];
//                    nums[j] = nums[j - 1];
//                    nums[j - 1] = temp;
//                }
//                k--;
//                i--;
//            }
//        }
    }
}
