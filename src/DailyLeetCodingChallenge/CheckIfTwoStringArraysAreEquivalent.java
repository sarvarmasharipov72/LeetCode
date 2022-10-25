package DailyLeetCodingChallenge;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        for (String s : word1) {
            st1.append(s);
        }
        for (String s : word2) {
            st2.append(s);
        }
        return st1.toString().equals(st2.toString());
    }
}
