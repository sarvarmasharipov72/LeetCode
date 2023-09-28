package DailyLeetCodingChallenge;

public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        // 1. The monotonic stack that saves the result
        char result[] = new char[s.length()];
        int top = 0;

        char array[] = s.toCharArray();
        // 2. The hash table that records the freq of character
        int freq[] = new int[26];
        for (int i = 0; i < array.length; i++) {
            freq[array[i] - 'a']++;
        }

        // 3. There can't be duplicate element in the subsequence
        boolean used[] = new boolean[26];

        for (int i = 0; i < array.length; i++) {
            freq[array[i] - 'a']--;
            if (used[array[i] - 'a']) {
                continue;
            }
            while (top > 0 && array[i] < result[top - 1] && freq[result[top - 1] - 'a'] > 0) {
                used[result[--top] - 'a'] = false;
            }
            result[top++] = array[i];
            used[array[i] - 'a'] = true;
        }
        return String.copyValueOf(result, 0, top);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbdccbc"));
    }
}
