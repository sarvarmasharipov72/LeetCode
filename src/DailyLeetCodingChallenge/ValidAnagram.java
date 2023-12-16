package DailyLeetCodingChallenge;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] countArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i), t1 = t.charAt(i);
            countArray[s1 - 'a']++;
            countArray[t1 - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (countArray[i] != 0) return false;
        }
        return true;
    }
}
