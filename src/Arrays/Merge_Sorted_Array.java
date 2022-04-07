package Arrays;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1, k = n-1;
        int[] arr = new int[m+n];
        for (int i = m+n -1; i >= 0; i--){
            if (j == -1){ nums1[i] = nums2[k--]; continue;}
            if (k == -1){ nums1[i] = nums1[j--]; continue;}
            nums1[i] = (nums2[k] < nums1[j]) ? nums1[j--] : nums2[k--];
        }
    }
}
