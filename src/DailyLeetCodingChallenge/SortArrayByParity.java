package DailyLeetCodingChallenge;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (!checkOdd(nums[right])) {
                right--;
            } else if (checkOdd(nums[left])) {
                left++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
    static boolean checkOdd(int a){
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        int[] s = {3,2,1,4};
        sortArrayByParity(s);
    }
}
