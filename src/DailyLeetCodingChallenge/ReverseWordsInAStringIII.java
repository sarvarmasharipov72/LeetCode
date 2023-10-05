package DailyLeetCodingChallenge;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int j = split[i].length() - 1; j >= 0; j--) {
                builder.append(split[i].charAt(j));
            }
            if (i != split.length - 1) builder.append(" ");
        }
        return builder.toString();
    }
}
