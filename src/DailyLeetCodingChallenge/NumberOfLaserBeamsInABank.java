package DailyLeetCodingChallenge;

public class NumberOfLaserBeamsInABank {
    public int numberOfBeams(String[] bank) {
        int lastCount = 0, beams = 0;
        for (String word : bank) {
            int count = 0;
            for (char symbol : word.toCharArray()) {
                if (symbol == '1') {
                    count++;
                }
            }
            if (lastCount != 0 && count != 0) {
                beams += lastCount * count;
            }
            if (count != 0) {
                lastCount = count;
            }
        }
        System.gc();
        return beams;
    }
}
