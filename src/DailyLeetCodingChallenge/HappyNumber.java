package DailyLeetCodingChallenge;

import java.util.HashSet;

public class HappyNumber {
    private static HashSet<Integer> set = new HashSet(10);
    public static boolean isHappy(int n) {
        int sum = 0;
        while (n >0) {
            sum += (n%10)*(n%10);
            n /= 10;
        }
        if (set.contains(sum)) return false;
        else set.add(sum);
        if (sum == 1) return true;
        return isHappy(sum);
    }

    public static void main(String[] args) {
        isHappy(19);
    }
}
