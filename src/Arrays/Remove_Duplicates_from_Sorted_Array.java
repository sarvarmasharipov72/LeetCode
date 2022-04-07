package Arrays;

import java.util.Collections;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++){
            if ( nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j;
    }
}
