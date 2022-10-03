package DailyLeetCodingChallenge;

public class MinimumTimeToMakeRopeColorful {

    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                if (neededTime[i] < neededTime[i - 1]) {
                    int temp = neededTime[i];
                    neededTime[i] = neededTime[i - 1];
                    neededTime[i - 1] = temp;
                }
                time += Math.min(neededTime[i], neededTime[i - 1]);
            }
        }
        return time;
    }
}
