package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) set2.add(n);

        int[] num = new int[set1.size()];
        int id = 0;

        for (Integer n : set1) {
            if (set2.contains(n)) {
                num[id++] = n;
            }
        }
        set1 = null;
        set2 = null;
        return Arrays.copyOf(num, id);
    }
}
