package Arrays;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for ( int i = 0; i < k; i++){
            if (nums[i] == val){
                k--;
                for (int j = i+1; j < nums.length; j++){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return k;
    }
//    int j = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] != val){
//                nums[j++] = nums[i];
//            }
//        }
}
