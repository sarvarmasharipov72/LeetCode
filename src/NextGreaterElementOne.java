public class NextGreaterElementOne {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false, tag = true;
            for (int k : nums2) {
                if (nums1[i] == k) flag = true;
                if (flag && nums1[i] < k) {
                    nums1[i] = k;
                    tag = false;
                    break;
                }
            }
            if (tag) {
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
