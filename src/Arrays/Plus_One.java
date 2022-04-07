package Arrays;

import java.util.Arrays;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            digits[i] += 1;
            if (digits[i] < 10) return digits;
            digits[i] = 0;
        }
        int[] arr = new int[1 +1];
        arr[0] = 1;
        System.out.println("digits = " + Arrays.toString(arr));
        return arr;
    }
}
