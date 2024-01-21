package DailyLeetCodingChallenge;

public class MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        if (s.length() == 1) return 0;
        int count = 0;
        boolean isZero = s.charAt(0) == '0';
        for (int i = 1; i < s.length(); i++) {
            if (isZero && s.charAt(i) == '1') {
                isZero = false;
            } else if (!isZero && s.charAt(i) == '0') {
                isZero = true;
            } else {
                isZero = !isZero;
                count++;
            }
        }
        return count;
    }
}
