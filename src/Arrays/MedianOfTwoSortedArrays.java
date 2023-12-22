package Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums2.length + nums1.length, i = 0, n1 = 0, n2 = 0;
        int[] l = new int[size/2 + 3];
        if (size % 2 == 0){
            while (true) {
                if (n1 == nums1.length) {
                    l[i] = nums2[n2++];
                } else if (n2 == nums2.length) {
                    l[i] = nums1[n1++];
                } else {
                    l[i] = (nums1[n1] < nums2[n2]) ? nums1[n1++] : nums2[n2++];
                }
                if (i == ((size / 2))) {
                    return (l[i] + l[i - 1]) / 2.0;
                }
                i++;
            }
        } else {
            while (true) {
                if (n1 == nums1.length) {
                    l[i] = nums2[n2++];
                } else if (n2 == nums2.length) {
                    l[i] = nums1[n1++];
                } else {
                    l[i] = (nums1[n1] < nums2[n2]) ? nums1[n1++] : nums2[n2++];
                }                if (i == ((size / 2))) {
                    return l[i];
                }
                i++;
            }
        }
    }
}
