package DailyLeetCodingChallenge;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) return true;
        int left = 1, right = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                left++;
                if (left != i + 1) return false;
            } else if (nums[i - 1] < nums[i]){
                right--;
                if (right*-1 != i + 1) return false;
            } else {
                left++;
                right--;
            }
        }
        return nums.length == left || nums.length == right*-1;
    }

    public static void main(String[] args) {
        isMonotonic(new int[] {1,2,2,3});
    }
}
