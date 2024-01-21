package DailyLeetCodingChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(x -> x[0]));
        int max = 0;
        for (int i = 1; i < points.length; i++) {
            max = Math.max(points[i][0] - points[i - 1][0], max);
        }
        return max;
    }
}
