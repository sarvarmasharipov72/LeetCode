package DailyLeetCodingChallenge;

public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 49) right++;
        }
        int max = 0, left = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 48) left++;
            else right--;
            max = Math.max(max, left + right);
        }
        return max;
    }
}
