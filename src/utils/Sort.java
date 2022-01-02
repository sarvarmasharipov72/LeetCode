package utils;

import java.util.Arrays;

public class Sort {
    public static int[] sort(int[] nums){
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < nums[i - 1]){
                int j = i;
                while(true){
                    if (j == 0) break;
                    if (nums[j] > nums[j -1]) break;
                    else{
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                        j--;
                    }
                }
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
        return new int[]{};
    }

    public static void main(String[] args) {
        sort(new int[]{2,1,4,9,5,7,0,3});
    }
}
