package DailyLeetCodingChallenge;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (char element : s.toCharArray()) {
            int index = sb.indexOf(element + "");
            if (index != -1) {
                sb.delete(0, index + 1);
            }
            sb.append(element);
            max = Math.max(max, sb.length());
        }
        return max;
    }
}
