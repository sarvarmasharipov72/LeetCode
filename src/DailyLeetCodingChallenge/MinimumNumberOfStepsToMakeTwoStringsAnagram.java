package DailyLeetCodingChallenge;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        StringBuilder builder = new StringBuilder(s);
        for (char i: t.toCharArray()) {
            int index = builder.indexOf(i + "");
            if (index != -1)
                builder.replace(index, index + 1, "");
        }
        return builder.length();
    }
}
