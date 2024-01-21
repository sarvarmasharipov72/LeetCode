package Arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 2) return Math.min(height[0], height[1]);
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            max = Math.max(max, minHeight * (j - i));
            while (i < j && minHeight > height[i]) i++;
            while (i < j && minHeight > height[j]) j--;
        }
        return max;
    }
    /* not effective
     public int maxArea(int[] height) {
        if (height.length == 2) return Math.min(height[0], height[1]);
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            int subMax = Math.min(height[i], height[j]) * (j - i);
            if (subMax > max) {
                max = subMax;
            }
            if (height[i] > height[j])
                j--;
            else
                i++;
        }
        return max;
    }
     */
}
