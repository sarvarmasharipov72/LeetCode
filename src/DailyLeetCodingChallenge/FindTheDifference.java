package DailyLeetCodingChallenge;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
       int num = 0;
        for (int i = 0; i < t.length(); i++) {
            if (i ==  t.length() -1) {
                num += t.charAt(i);
                break;
            }
            num -= s.charAt(i);
            num += t.charAt(i);
        }
        return (char) (num);
    }
}
